import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in); // 可以用scanner(简单输入场景)
//        BufferedReader kbin = new BufferedReader(new InputStreamReader(System.in)); // 用于将字节流（InputStream）转换为字符流（Reader）
        while (true) { // 用于为字符流（如 Reader）提供缓冲功能，提高读取效率，提供了方便的方法如 readLine()，可以直接读取一整行文本。
            System.out.print("#");
            String cmd = sc.nextLine(); // command

            if (cmd.toLowerCase().equals("exit")) {
                System.exit(0);
            } else if (cmd.toLowerCase().startsWith("ls")) {
                ls(cmd);
            } else if (cmd.toLowerCase().startsWith("cp")) {
                cp(cmd);
            } else if (cmd.toLowerCase().startsWith("mv")) {
                mv(cmd);
            } else if (cmd.toLowerCase().startsWith("rm")) {
                rm(cmd);
            } else if (cmd.toLowerCase().startsWith("md")) {
                md(cmd);
            } else if (cmd.toLowerCase().startsWith("rd")) {
                rd(cmd);
            } else if (cmd.toLowerCase().startsWith("cat")) {
                cat(cmd);
            } else {
                System.out.println("无法识别所输入命令:" + cmd);
            }
        }
    }

    public static void ls(String cmd) {
        String[] cmds = cmd.split(" ", 2);
        if (cmds.length == 1) { // 只输入了ls
            System.out.println("命令格式不正确");
            return;
        }
        String directory = cmds[1];
        File currentDir = new File(""); // 当前目录
        if (directory.equals(".")) {
            directory = currentDir.getAbsolutePath();
        } else if (directory.equals("..")) {
            File parentDir = new File(currentDir.getAbsolutePath()); // 父目录(不能输入空，输入空然后getParent得不到父目录)
            if (parentDir.getParent() == null) {
                System.out.println("已经是根目录");
                return;
            }
            directory = parentDir.getParent(); // 父级目录
        }

        File dir = new File(directory);
        if (!dir.exists()) {
            System.out.println("找不到目录");
            return;
        }
        File[] files = dir.listFiles();
        if (files != null) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            for (File file : files) {
                String date = format.format(file.lastModified());
                String isDir = "";
                if (file.isDirectory()) {
                    isDir = "<DIR>";
                }
                String length = "";
                if (file.isFile()) {
                    length = String.valueOf(file.length());
                }
                System.out.printf("%s   %5s   %10s   %s\n", date, isDir, length, file.getName());
            }
        }
    }

    public static void cp(String cmd) throws IOException {
        String[] cmds = cmd.split(" ", 3);
        if (cmds.length == 1 || cmds.length == 2) { // 只输入了cp或cp+一个参数
            System.out.println("格式命令不正确");
            return;
        }
        String src = cmds[1]; // 要复制文件的路径
        String dest = cmds[2]; // 复制到何处的路径

        File srcFile = new File(src); // 源路径
        if (!srcFile.exists()) {
            System.out.println("源文件不存在");
            return;
        } else if (srcFile.isDirectory()) {
            System.out.println("不是有效文件");
            return;
        }


        File destFile = new File(dest); // 复制到
        if (destFile.isDirectory()) { // 如果目标是目录的话，需要加上文件名才可以写入
            destFile = new File(dest + srcFile.getName());
        }

        if (destFile.exists()) { // 目的地存在同名文件
            System.out.println("覆盖" + dest + "吗?(Y\\n)"); //转义字符
            Scanner sc = new Scanner(System.in);
            String confirm = sc.nextLine();
            if (!(confirm.equals("Y") || confirm.equals("y"))) {
                return;
            }
        }

        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile); // 不能直接向目录写入
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }
        fos.close(); // 先关掉写
        fis.close();
    }

    public static void mv(String cmd) throws IOException {
        String[] cmds = cmd.split(" ", 3);
        if (cmds.length == 1 || cmds.length == 2) {
            System.out.println("格式命令不正确");
            return;
        }

        String src = cmds[1];
        String dest = cmds[2];

        File srcFile = new File(src);
        if (!srcFile.exists()) {
            System.out.println("源文件不存在");
            return;
        } else if (srcFile.isDirectory()) {
            System.out.println("不是有效文件");
            return;
        }

        File destFile = new File(dest);
        if (destFile.isDirectory()) { // 如果目的地是一个目录, 就把destFile的路径换为源路径+文件名
            destFile = new File(dest + srcFile.getName()); // 没有文件名无法用流写入
        }

        if (destFile.exists()) {
            System.out.println("覆盖" + dest + "吗?(Y\\n)");
            Scanner sc = new Scanner(System.in);
            String confirm = sc.nextLine();
            if (!(confirm.equals("Y") || confirm.equals("y"))) {
                return;
            }
        }

        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }
        fos.close();
        fis.close();

        srcFile.delete();
    }

    public static void rm(String cmd) {
        String[] cmds = cmd.split(" ", 2);
        if (cmds.length == 1) {
            System.out.println("格式命令不正确");
            return;
        }

        String src = cmds[1];

        File srcFile = new File(src);

        if (srcFile.isDirectory()) {
            System.out.println("不是有效文件");
            return;
        }
        if (!(srcFile.exists())) {
            System.out.println("文件不存在");
            return;
        }

        System.out.println("删除" + src + "吗?(Y\\n)");
        Scanner sc = new Scanner(System.in);
        String confirm = sc.nextLine();
        if (!(confirm.equals("Y") || confirm.equals("y"))) {
            return;
        }
        srcFile.delete();
    }

    public static void md(String cmd) {
        String[] cmds = cmd.split(" ", 2);
        if (cmds.length == 1) {
            System.out.println("格式命令不正确");
            return;
        }

        String newDir = cmds[1];
        File newDirFile = new File(newDir);
        if (newDirFile.exists()) {
            System.out.println("目录已存在");
            return;
        }

        newDirFile.mkdir();
    }

    public static void rd(String cmd) {
        String[] cmds = cmd.split(" ", 2);
        if (cmds.length == 1) {
            System.out.println("命令格式不正确");
            return;
        }

        String src = cmds[1];

        File srcDir = new File(src);

        if (!(srcDir.exists())) {
            System.out.println("目录不存在");
            return;
        }
        if (!(srcDir.isDirectory())) {
            System.out.println("目录名称无效");
            return;
        }

        String[] childDir = srcDir.list(); // 看看是否有子目录
        if (childDir != null && childDir.length > 0) {
            System.out.println("目录非空");
            return;
        }
        srcDir.delete();
    }

    public static void cat(String cmd) throws IOException {
        String[] cmds = cmd.split(" ", 2);
        if (cmds.length == 1) {
            System.out.println("命令格式不正确");
            return;
        }

        String src = cmds[1];

        File srcFile = new File(src);

        if (!(srcFile.exists())) {
            System.out.println("文件不存在");
            return;
        }
        if (srcFile.isDirectory()) {
            System.out.println("不是有效文件");
            return;
        }

        FileInputStream fis = new FileInputStream(srcFile);
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = fis.read(buffer)) != -1) {
            System.out.write(buffer, 0, len);
        }
        fis.close();
        System.out.println();
    }
}