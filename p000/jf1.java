package p000;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class jf1 implements Closeable {

    /* JADX INFO: renamed from: a */
    public static final zb2 f22209a;

    static {
        zb2 zb2Var;
        try {
            Class.forName("java.nio.file.Files");
            zb2Var = new w03();
        } catch (ClassNotFoundException unused) {
            zb2Var = new zb2();
        }
        f22209a = zb2Var;
        String str = p83.f27431b;
        h50.m6221B(System.getProperty("java.io.tmpdir"));
        qo3.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public f74 mo3774a(p83 p83Var) {
        return new C1042pp(new FileOutputStream(p83Var.toFile(), true), new ym4());
    }

    /* JADX INFO: renamed from: b */
    public void mo3775b(p83 p83Var, p83 p83Var2) throws IOException {
        if (p83Var.toFile().renameTo(p83Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + p83Var + " to " + p83Var2);
    }

    /* JADX INFO: renamed from: e */
    public void mo3776e(p83 p83Var) throws IOException {
        throw new IOException(this + " is read-only");
    }

    /* JADX INFO: renamed from: g */
    public void mo3777g(p83 p83Var) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = p83Var.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        nm0.m8795g(p83Var, "failed to delete ");
    }

    /* JADX INFO: renamed from: j */
    public final boolean m7089j(p83 p83Var) {
        return mo3779q(p83Var) != null;
    }

    /* JADX INFO: renamed from: k */
    public List mo3778k(p83 p83Var) throws IOException {
        File file = p83Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                nm0.m8795g(p83Var, "failed to list ");
                return null;
            }
            throw new FileNotFoundException("no such file: " + p83Var);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(p83Var.m9386d(str));
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final xe1 m7090l(p83 p83Var) throws FileNotFoundException {
        xe1 xe1VarMo3779q = mo3779q(p83Var);
        if (xe1VarMo3779q != null) {
            return xe1VarMo3779q;
        }
        throw new FileNotFoundException("no such file: " + p83Var);
    }

    /* JADX INFO: renamed from: q */
    public xe1 mo3779q(p83 p83Var) {
        File file = p83Var.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new xe1(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public f74 mo3780t(p83 p83Var) {
        return new C1042pp(new FileOutputStream(p83Var.toFile(), false), new ym4());
    }

    /* JADX INFO: renamed from: u */
    public ja4 mo3781u(p83 p83Var) {
        return new C1079qp(new FileInputStream(p83Var.toFile()), ym4.f35333d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
