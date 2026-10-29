package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ah3 {

    /* JADX INFO: renamed from: a */
    public static final no3 f14506a = new no3();

    /* JADX INFO: renamed from: b */
    public static final Object f14507b = new Object();

    /* JADX INFO: renamed from: c */
    public static f70 f14508c = null;

    /* JADX WARN: Code duplicated, block: B:104:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:99:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static void m2993a(Context context, boolean z) {
        int i;
        boolean z2;
        File file;
        boolean z3;
        File file2;
        long length;
        boolean z4;
        File file3;
        zg3 zg3VarM13549a;
        zg3 zg3Var;
        zg3 zg3Var2;
        int i2;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z || f14508c == null) {
            synchronized (f14507b) {
                if (z) {
                    i = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file.length();
                    if (file.exists()) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    long j = context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).lastUpdateTime;
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        zg3VarM13549a = zg3.m13549a(file3);
                    } else {
                        zg3VarM13549a = null;
                    }
                    if (zg3VarM13549a == null) {
                        if (!z2) {
                            i = 327680;
                        } else if (z3) {
                            i = 1;
                        } else if (z4) {
                            i = 2;
                        }
                    } else if (!z2) {
                        i = 327680;
                    } else if (z3) {
                        i = 1;
                    } else if (z4) {
                        i = 2;
                    }
                    if (z) {
                        i = 2;
                    }
                    if (zg3VarM13549a != null) {
                        i = 3;
                    }
                    zg3Var = zg3VarM13549a;
                    zg3Var2 = new zg3(1, i, j, length);
                    if (zg3Var != null) {
                        zg3Var2.m13550b(file3);
                    } else {
                        zg3Var2.m13550b(file3);
                    }
                    f70 f70Var = new f70((byte) 15);
                    f14508c = f70Var;
                    f14506a.m7820k(f70Var);
                    return;
                }
                if (f14508c != null) {
                    return;
                }
                i = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length3 = file.length();
                        if (file.exists() || length3 <= 0) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists() || length <= 0) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        try {
                            long j2 = context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).lastUpdateTime;
                            file3 = new File(context.getFilesDir(), "profileInstalled");
                            if (file3.exists()) {
                                try {
                                    zg3VarM13549a = zg3.m13549a(file3);
                                } catch (IOException unused) {
                                    f70 f70Var2 = new f70((byte) 15);
                                    f14508c = f70Var2;
                                    f14506a.m7820k(f70Var2);
                                    return;
                                }
                            } else {
                                zg3VarM13549a = null;
                            }
                            if (zg3VarM13549a == null && zg3VarM13549a.f36065c == j2 && (i2 = zg3VarM13549a.f36064b) != 2) {
                                i = i2;
                            } else if (!z2) {
                                i = 327680;
                            } else if (z3) {
                                i = 1;
                            } else if (z4) {
                                i = 2;
                            }
                            if (z && z4 && i != 1) {
                                i = 2;
                            }
                            if (zg3VarM13549a != null && zg3VarM13549a.f36064b == 2 && i == 1 && length3 < zg3VarM13549a.f36066d) {
                                i = 3;
                            }
                            zg3Var = zg3VarM13549a;
                            zg3Var2 = new zg3(1, i, j2, length);
                            if (zg3Var != null || !zg3Var.equals(zg3Var2)) {
                                try {
                                    zg3Var2.m13550b(file3);
                                } catch (IOException unused2) {
                                }
                            }
                            f70 f70Var3 = new f70((byte) 15);
                            f14508c = f70Var3;
                            f14506a.m7820k(f70Var3);
                            return;
                        } catch (PackageManager.NameNotFoundException unused3) {
                            f70 f70Var4 = new f70((byte) 15);
                            f14508c = f70Var4;
                            f14506a.m7820k(f70Var4);
                            return;
                        }
                    } catch (Throwable th) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException unused4) {
                    z2 = false;
                }
                throw th;
            }
        }
    }
}
