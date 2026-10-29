package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class tf1 extends y42 {
    /* JADX INFO: renamed from: N0 */
    public static final ye1 m11043N0(ye1 ye1Var) {
        File file = ye1Var.f35159a;
        List<File> list = ye1Var.f35160b;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file2 : list) {
            String name = file2.getName();
            if (!z62.m13387o(name, ".")) {
                if (!z62.m13387o(name, "..")) {
                    arrayList.add(file2);
                } else if (arrayList.isEmpty() || z62.m13387o(((File) hb0.m6306R0(arrayList)).getName(), "..")) {
                    arrayList.add(file2);
                }
            }
        }
        return new ye1(file, arrayList);
    }

    /* JADX INFO: renamed from: O0 */
    public static String m11044O0(File file) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), z80.f35863a);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int i = inputStreamReader.read(cArr); i >= 0; i = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, i);
            }
            String string = stringWriter.toString();
            inputStreamReader.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                lb5.m7941v(inputStreamReader, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX INFO: renamed from: P0 */
    public static File m11045P0(File file, File file2) {
        ye1 ye1VarM11043N0 = m11043N0(y42.m12833I0(file));
        List list = ye1VarM11043N0.f35160b;
        ye1 ye1VarM11043N1 = m11043N0(y42.m12833I0(file2));
        List list2 = ye1VarM11043N1.f35160b;
        boolean zEquals = ye1VarM11043N0.f35159a.equals(ye1VarM11043N1.f35159a);
        String string = null;
        if (zEquals) {
            int size = list2.size();
            int size2 = list.size();
            int iMin = Math.min(size2, size);
            int i = 0;
            while (i < iMin && z62.m13387o(list.get(i), list2.get(i))) {
                i++;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = size - 1;
            if (i <= i2) {
                while (true) {
                    if (!z62.m13387o(((File) list2.get(i2)).getName(), "..")) {
                        sb.append("..");
                        if (i2 != i) {
                            sb.append(File.separatorChar);
                        }
                        if (i2 != i) {
                            i2--;
                        } else {
                            if (i < size2) {
                                if (i < size) {
                                    sb.append(File.separatorChar);
                                }
                                hb0.m6304P0(hb0.m6295G0(list, i), sb, File.separator, null, 124);
                            }
                            string = sb.toString();
                        }
                    }
                }
            } else {
                if (i < size2) {
                    if (i < size) {
                        sb.append(File.separatorChar);
                    }
                    hb0.m6304P0(hb0.m6295G0(list, i), sb, File.separator, null, 124);
                }
                string = sb.toString();
            }
        }
        if (string != null) {
            return new File(string);
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }

    /* JADX INFO: renamed from: Q0 */
    public static File m11046Q0(File file, String str) {
        File file2 = new File(str);
        if (y42.m12867p0(file2.getPath()) > 0) {
            return file2;
        }
        String string = file.toString();
        if (string.length() != 0) {
            char c = File.separatorChar;
            if (string.length() <= 0 || !y62.m12994x(string.charAt(hd4.m6339e0(string)), c, false)) {
                return new File(string + c + file2);
            }
        }
        return new File(string + file2);
    }
}
