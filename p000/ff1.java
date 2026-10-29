package p000;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ff1 implements ka0 {

    /* JADX INFO: renamed from: a */
    public File f18942a;

    /* JADX INFO: renamed from: b */
    public t24 f18943b;

    /* JADX INFO: renamed from: c */
    public c74 f18944c;

    /* JADX INFO: renamed from: d */
    public C1053q f18945d;

    /* JADX INFO: renamed from: e */
    public AtomicBoolean f18946e;

    /* JADX INFO: renamed from: f */
    public gx2 f18947f;

    /* JADX WARN: Code duplicated, block: B:30:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[Catch: all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:33:0x0071, B:42:0x0082, B:41:0x007f, B:38:0x007a), top: B:49:0x0022, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [ff1] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [st0] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean] */
    /* JADX INFO: renamed from: a */
    public final Object m5699a(st0 st0Var, ym0 ym0Var) throws Throwable {
        df1 df1Var;
        ?? M6192f;
        Throwable th;
        bf1 bf1Var;
        ?? r7;
        gx2 gx2Var = this.f18947f;
        if (ym0Var instanceof df1) {
            df1Var = (df1) ym0Var;
            int i = df1Var.f17010x;
            if ((i & Integer.MIN_VALUE) != 0) {
                df1Var.f17010x = i - Integer.MIN_VALUE;
            } else {
                df1Var = new df1(this, ym0Var);
            }
        } else {
            df1Var = new df1(this, ym0Var);
        }
        Object obj = df1Var.f17008v;
        ap0 ap0Var = ap0.f14763a;
        int i2 = df1Var.f17010x;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = df1Var.f17007u;
                bf1Var = df1Var.f17006t;
                try {
                    k43.m7376J(obj);
                    r7 = this;
                    try {
                        bf1Var.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r7 != 0) {
                        gx2Var.m6193g(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        bf1Var.close();
                    } catch (Throwable th4) {
                        se0.m10720f(th, th4);
                    }
                    throw th;
                }
            }
            k43.m7376J(obj);
            if (this.f18946e.get()) {
                C1077qn.m9989o("StorageConnection has already been disposed.");
                return null;
            }
            M6192f = gx2Var.m6192f();
            try {
                bf1 bf1Var2 = new bf1(this.f18942a, this.f18943b);
                try {
                    Boolean boolValueOf = Boolean.valueOf((boolean) M6192f);
                    df1Var.f17006t = bf1Var2;
                    df1Var.f17007u = M6192f;
                    df1Var.f17010x = 1;
                    Object objInvoke = st0Var.invoke(bf1Var2, boolValueOf, df1Var);
                    if (objInvoke == ap0Var) {
                        return ap0Var;
                    }
                    obj = objInvoke;
                    r7 = M6192f == true ? 1 : 0;
                    bf1Var = bf1Var2;
                    bf1Var.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r7 != 0) {
                        gx2Var.m6193g(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    this = M6192f == true ? 1 : 0;
                    bf1Var = bf1Var2;
                    bf1Var.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                if (M6192f != 0) {
                    gx2Var.m6193g(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            M6192f = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ba A[Catch: all -> 0x00c4, IOException -> 0x00c7, TRY_ENTER, TryCatch #8 {IOException -> 0x00c7, all -> 0x00c4, blocks: (B:42:0x00ba, B:44:0x00c0, B:52:0x00d1, B:59:0x00df, B:58:0x00dc), top: B:72:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0 A[Catch: all -> 0x00c4, IOException -> 0x00c7, TRY_LEAVE, TryCatch #8 {IOException -> 0x00c7, all -> 0x00c4, blocks: (B:42:0x00ba, B:44:0x00c0, B:52:0x00d1, B:59:0x00df, B:58:0x00dc), top: B:72:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1 A[Catch: all -> 0x00c4, IOException -> 0x00c7, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x00c7, all -> 0x00c4, blocks: (B:42:0x00ba, B:44:0x00c0, B:52:0x00d1, B:59:0x00df, B:58:0x00dc), top: B:72:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX INFO: renamed from: b */
    public final Object m5700b(qu0 qu0Var, ym0 ym0Var) throws Throwable {
        ef1 ef1Var;
        File file;
        gx2 gx2Var;
        sf1 sf1Var;
        Throwable th;
        sf1 sf1Var2;
        gx2 gx2Var2;
        File file2;
        File file3 = this.f18942a;
        if (ym0Var instanceof ef1) {
            ef1Var = (ef1) ym0Var;
            int i = ef1Var.f18049z;
            if ((i & Integer.MIN_VALUE) != 0) {
                ef1Var.f18049z = i - Integer.MIN_VALUE;
            } else {
                ef1Var = new ef1(this, ym0Var);
            }
        } else {
            ef1Var = new ef1(this, ym0Var);
        }
        gx2 gx2Var3 = ef1Var.f18047x;
        ap0 ap0Var = ap0.f14763a;
        int i2 = ef1Var.f18049z;
        try {
            try {
                try {
                    try {
                        if (i2 == 0) {
                            k43.m7376J(gx2Var3);
                            if (this.f18946e.get()) {
                                C1077qn.m9989o("StorageConnection has already been disposed.");
                                return null;
                            }
                            File parentFile = file3.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    nm0.m8795g(file3, "Unable to create parent directories of ");
                                    return null;
                                }
                            }
                            gx2Var = this.f18947f;
                            ef1Var.f18043t = qu0Var;
                            ef1Var.f18044u = gx2Var;
                            ef1Var.f18049z = 1;
                            if (gx2Var.m6191e(ef1Var) != ap0Var) {
                            }
                            return ap0Var;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            sf1Var2 = ef1Var.f18046w;
                            File file4 = ef1Var.f18045v;
                            gx2Var2 = ef1Var.f18044u;
                            try {
                                k43.m7376J(gx2Var3);
                                file2 = file4;
                                try {
                                    sf1Var2.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists()) {
                                    zp0.m13680l(file2, file3);
                                }
                                gx2Var2.m6193g(null);
                                return ju4.f22634a;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    sf1Var2.close();
                                } catch (Throwable th4) {
                                    se0.m10720f(th, th4);
                                }
                                throw th;
                            }
                        }
                        gx2 gx2Var4 = ef1Var.f18044u;
                        qu0 qu0Var2 = ef1Var.f18043t;
                        k43.m7376J(gx2Var3);
                        gx2Var = gx2Var4;
                        qu0Var = qu0Var2;
                        ef1Var.f18043t = null;
                        ef1Var.f18044u = gx2Var;
                        ef1Var.f18045v = file;
                        ef1Var.f18046w = sf1Var;
                        ef1Var.f18049z = 2;
                        if (qu0Var.invoke(sf1Var, ef1Var) != ap0Var) {
                            gx2Var2 = gx2Var;
                            file2 = file;
                            sf1Var2 = sf1Var;
                            sf1Var2.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                zp0.m13680l(file2, file3);
                            }
                            gx2Var2.m6193g(null);
                            return ju4.f22634a;
                        }
                        return ap0Var;
                    } catch (Throwable th5) {
                        th = th5;
                        sf1Var2 = sf1Var;
                        sf1Var2.close();
                        throw th;
                    }
                    sf1Var = new sf1(file, this.f18943b);
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw new IOException("Unable to rename " + file + " to " + file3 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.", e);
                }
                file = new File(file3.getAbsolutePath() + ".tmp");
            } catch (IOException e2) {
                e = e2;
                file = qu0Var;
            } catch (Throwable th6) {
                th = th6;
                gx2Var3 = ef1Var;
                gx2Var3.m6193g(null);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            gx2Var3.m6193g(null);
            throw th;
        }
    }

    @Override // p000.ka0
    public final void close() {
        this.f18946e.set(true);
        this.f18945d.invoke();
    }
}
