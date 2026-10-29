package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import p000.C1077qn;
import p000.ExecutorC0952nn;
import p000.ah3;
import p000.bt0;
import p000.d24;
import p000.gz0;
import p000.n40;
import p000.wd3;
import p000.y42;
import p000.y62;
import p000.z62;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    /* JADX WARN: Code duplicated, block: B:106:0x018b A[Catch: all -> 0x0188, TRY_ENTER, TRY_LEAVE, TryCatch #15 {all -> 0x0188, blocks: (B:95:0x016e, B:97:0x017a, B:106:0x018b), top: B:248:0x016e }] */
    /* JADX WARN: Code duplicated, block: B:117:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:131:0x01d7 A[Catch: all -> 0x020c, TryCatch #19 {all -> 0x020c, blocks: (B:129:0x01d1, B:131:0x01d7, B:132:0x01db, B:134:0x01e1, B:135:0x01e6, B:155:0x020f, B:156:0x0216), top: B:252:0x01d1, outer: #16 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x01e1 A[Catch: all -> 0x020c, LOOP:0: B:132:0x01db->B:134:0x01e1, LOOP_END, TryCatch #19 {all -> 0x020c, blocks: (B:129:0x01d1, B:131:0x01d7, B:132:0x01db, B:134:0x01e1, B:135:0x01e6, B:155:0x020f, B:156:0x0216), top: B:252:0x01d1, outer: #16 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x024e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0258  */
    /* JADX WARN: Code duplicated, block: B:18:0x009c  */
    /* JADX WARN: Code duplicated, block: B:237:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x01b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x01d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01e6 A[EDGE_INSN: B:269:0x01e6->B:135:0x01e6 BREAK  A[LOOP:0: B:132:0x01db->B:134:0x01e1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00bf A[Catch: all -> 0x00d4, IllegalStateException -> 0x00d7, IOException -> 0x00d9, TRY_LEAVE, TryCatch #29 {IOException -> 0x00d9, IllegalStateException -> 0x00d7, blocks: (B:28:0x00b5, B:30:0x00bf, B:41:0x00db, B:42:0x00e0), top: B:265:0x00b5, outer: #22 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00db A[Catch: all -> 0x00d4, IllegalStateException -> 0x00d7, IOException -> 0x00d9, TRY_ENTER, TryCatch #29 {IOException -> 0x00d9, IllegalStateException -> 0x00d7, blocks: (B:28:0x00b5, B:30:0x00bf, B:41:0x00db, B:42:0x00e0), top: B:265:0x00b5, outer: #22 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0118 A[Catch: all -> 0x012d, TRY_LEAVE, TryCatch #3 {all -> 0x012d, blocks: (B:61:0x010c, B:63:0x0118, B:74:0x0130, B:75:0x0135), top: B:237:0x010c }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0130 A[Catch: all -> 0x012d, TRY_ENTER, TryCatch #3 {all -> 0x012d, blocks: (B:61:0x010c, B:63:0x0118, B:74:0x0130, B:75:0x0135), top: B:237:0x010c }] */
    /* JADX WARN: Code duplicated, block: B:81:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0141 A[Catch: IllegalStateException -> 0x0127, IOException -> 0x0129, FileNotFoundException -> 0x012b, TRY_LEAVE, TryCatch #27 {FileNotFoundException -> 0x012b, IOException -> 0x0129, IllegalStateException -> 0x0127, blocks: (B:59:0x0104, B:64:0x0122, B:82:0x0141, B:80:0x013e, B:79:0x013b), top: B:268:0x0104 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0157  */
    /* JADX WARN: Code duplicated, block: B:92:0x0165  */
    /* JADX WARN: Code duplicated, block: B:97:0x017a A[Catch: all -> 0x0188, TRY_LEAVE, TryCatch #15 {all -> 0x0188, blocks: (B:95:0x016e, B:97:0x017a, B:106:0x018b), top: B:248:0x016e }] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        FileInputStream fileInputStreamM3670c;
        gz0[] gz0VarArrM12956Z;
        gz0[] gz0VarArr;
        bt0 bt0Var;
        FileInputStream fileInputStreamM3670c2;
        wd3 wd3Var;
        gz0[] gz0VarArr2;
        byte[] bArr;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr2;
        int i;
        boolean z;
        boolean z2;
        ByteArrayOutputStream byteArrayOutputStream;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (!"androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            if (!"androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                    Process.sendSignal(Process.myPid(), 10);
                    Log.d("ProfileInstaller", "");
                    setResultCode(12);
                    return;
                } else {
                    if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                        return;
                    }
                    String string = extras.getString("EXTRA_BENCHMARK_OPERATION");
                    wd3 wd3Var2 = new wd3(this, (byte) 1);
                    if (!"DROP_SHADER_CACHE".equals(string)) {
                        wd3Var2.mo10207h(16, null);
                        return;
                    }
                    if (n40.m8502l(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                        wd3Var2.mo10207h(14, null);
                        return;
                    } else {
                        wd3Var2.mo10207h(15, null);
                        return;
                    }
                }
            }
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string2 = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string2)) {
                    if ("DELETE_SKIP_FILE".equals(string2)) {
                        ExecutorC0952nn executorC0952nn = new ExecutorC0952nn((byte) 1);
                        wd3 wd3Var3 = new wd3(this, (byte) 1);
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        y42.m12825E0(executorC0952nn, wd3Var3, 11, null);
                        return;
                    }
                    return;
                }
                ExecutorC0952nn executorC0952nn2 = new ExecutorC0952nn((byte) 1);
                wd3 wd3Var4 = new wd3(this, (byte) 1);
                try {
                    y42.m12873v0(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    y42.m12825E0(executorC0952nn2, wd3Var4, 10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    y42.m12825E0(executorC0952nn2, wd3Var4, 7, e);
                    return;
                }
            }
            return;
        }
        wd3 wd3Var5 = new wd3(this, (byte) 1);
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr3 = y62.f34946x;
            File file = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            bt0 bt0Var2 = new bt0();
            bt0Var2.f15564a = false;
            bt0Var2.f15565b = wd3Var5;
            bt0Var2.f15567d = name;
            bt0Var2.f15566c = file;
            byte[] bArr4 = z62.f35783e;
            VarHandle.storeStoreFence();
            if (!file.exists()) {
                try {
                    if (file.createNewFile()) {
                        bt0Var2.f15564a = true;
                        fileInputStreamM3670c = bt0Var2.m3670c(assets, "dexopt/baseline.prof");
                        if (fileInputStreamM3670c != null) {
                            if (Arrays.equals(bArr3, d24.m4291F(fileInputStreamM3670c, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            gz0VarArrM12956Z = y62.m12956Z(fileInputStreamM3670c, d24.m4291F(fileInputStreamM3670c, 4), (String) bt0Var2.f15567d);
                            fileInputStreamM3670c.close();
                            bt0Var2.f15568e = gz0VarArrM12956Z;
                        }
                        gz0VarArr = (gz0[]) bt0Var2.f15568e;
                        if (gz0VarArr != null) {
                            fileInputStreamM3670c2 = bt0Var2.m3670c(assets, "dexopt/baseline.profm");
                            if (fileInputStreamM3670c2 == null) {
                                if (fileInputStreamM3670c2 != null) {
                                    fileInputStreamM3670c2.close();
                                }
                                bt0Var = null;
                            } else {
                                if (Arrays.equals(y62.f34947y, d24.m4291F(fileInputStreamM3670c2, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                bt0Var2.f15568e = y62.m12953W(fileInputStreamM3670c2, d24.m4291F(fileInputStreamM3670c2, 4), bArr4, gz0VarArr);
                                fileInputStreamM3670c2.close();
                                bt0Var = bt0Var2;
                            }
                            if (bt0Var != null) {
                                bt0Var2 = bt0Var;
                            }
                        }
                        wd3Var = (wd3) bt0Var2.f15565b;
                        gz0VarArr2 = (gz0[]) bt0Var2.f15568e;
                        if (gz0VarArr2 != null) {
                            if (bt0Var2.f15564a) {
                                C1077qn.m9989o("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(bArr3);
                            byteArrayOutputStream.write(bArr4);
                            if (y62.m12970g0(byteArrayOutputStream, bArr4, gz0VarArr2)) {
                                bt0Var2.f15569f = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                bt0Var2.f15568e = null;
                            } else {
                                wd3Var.mo10207h(5, null);
                                bt0Var2.f15568e = null;
                                byteArrayOutputStream.close();
                            }
                        }
                        bArr = (byte[]) bt0Var2.f15569f;
                        if (bArr != null) {
                            if (bt0Var2.f15564a) {
                                C1077qn.m9989o("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            byteArrayInputStream = new ByteArrayInputStream(bArr);
                            fileOutputStream = new FileOutputStream((File) bt0Var2.f15566c);
                            channel = fileOutputStream.getChannel();
                            fileLockTryLock = channel.tryLock();
                            if (fileLockTryLock != null) {
                                if (fileLockTryLock.isValid()) {
                                    bArr2 = new byte[512];
                                    while (true) {
                                        i = byteArrayInputStream.read(bArr2);
                                        if (i > 0) {
                                            break;
                                            break;
                                        }
                                        fileOutputStream.write(bArr2, 0, i);
                                    }
                                    bt0Var2.m3672e(1, null);
                                    fileLockTryLock.close();
                                    channel.close();
                                    fileOutputStream.close();
                                    byteArrayInputStream.close();
                                    bt0Var2.f15569f = null;
                                    bt0Var2.f15568e = null;
                                    z = true;
                                }
                            }
                            throw new IOException("Unable to acquire a lock on the underlying file channel.");
                        }
                        z = false;
                        if (z) {
                            y42.m12873v0(packageInfo, filesDir);
                        }
                        z2 = z;
                    } else {
                        bt0Var2.m3672e(4, null);
                        z2 = false;
                    }
                } catch (IOException unused) {
                    bt0Var2.m3672e(4, null);
                }
            } else if (file.canWrite()) {
                bt0Var2.f15564a = true;
                try {
                    fileInputStreamM3670c = bt0Var2.m3670c(assets, "dexopt/baseline.prof");
                } catch (FileNotFoundException e2) {
                    wd3Var5.mo10207h(6, e2);
                    fileInputStreamM3670c = null;
                } catch (IOException e3) {
                    wd3Var5.mo10207h(7, e3);
                    fileInputStreamM3670c = null;
                }
                try {
                    if (fileInputStreamM3670c != null) {
                        try {
                            if (Arrays.equals(bArr3, d24.m4291F(fileInputStreamM3670c, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            gz0VarArrM12956Z = y62.m12956Z(fileInputStreamM3670c, d24.m4291F(fileInputStreamM3670c, 4), (String) bt0Var2.f15567d);
                            try {
                                fileInputStreamM3670c.close();
                            } catch (IOException e4) {
                                wd3Var5.mo10207h(7, e4);
                            }
                            bt0Var2.f15568e = gz0VarArrM12956Z;
                        } catch (IOException e5) {
                            wd3Var5.mo10207h(7, e5);
                            try {
                                fileInputStreamM3670c.close();
                            } catch (IOException e6) {
                                wd3Var5.mo10207h(7, e6);
                            }
                            gz0VarArrM12956Z = null;
                        } catch (IllegalStateException e7) {
                            wd3Var5.mo10207h(8, e7);
                            fileInputStreamM3670c.close();
                            gz0VarArrM12956Z = null;
                        }
                    }
                    gz0VarArr = (gz0[]) bt0Var2.f15568e;
                    if (gz0VarArr != null) {
                        try {
                            fileInputStreamM3670c2 = bt0Var2.m3670c(assets, "dexopt/baseline.profm");
                            if (fileInputStreamM3670c2 == null) {
                                try {
                                    if (Arrays.equals(y62.f34947y, d24.m4291F(fileInputStreamM3670c2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    bt0Var2.f15568e = y62.m12953W(fileInputStreamM3670c2, d24.m4291F(fileInputStreamM3670c2, 4), bArr4, gz0VarArr);
                                    fileInputStreamM3670c2.close();
                                    bt0Var = bt0Var2;
                                } catch (Throwable th) {
                                    try {
                                        fileInputStreamM3670c2.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } else {
                                if (fileInputStreamM3670c2 != null) {
                                    fileInputStreamM3670c2.close();
                                }
                                bt0Var = null;
                            }
                        } catch (FileNotFoundException e8) {
                            wd3Var5.mo10207h(9, e8);
                        } catch (IOException e9) {
                            wd3Var5.mo10207h(7, e9);
                        } catch (IllegalStateException e10) {
                            bt0Var2.f15568e = null;
                            wd3Var5.mo10207h(8, e10);
                        }
                        if (bt0Var != null) {
                            bt0Var2 = bt0Var;
                        }
                    }
                    wd3Var = (wd3) bt0Var2.f15565b;
                    gz0VarArr2 = (gz0[]) bt0Var2.f15568e;
                    if (gz0VarArr2 != null) {
                        if (bt0Var2.f15564a) {
                            C1077qn.m9989o("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            return;
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(bArr3);
                                byteArrayOutputStream.write(bArr4);
                                if (y62.m12970g0(byteArrayOutputStream, bArr4, gz0VarArr2)) {
                                    wd3Var.mo10207h(5, null);
                                    bt0Var2.f15568e = null;
                                    byteArrayOutputStream.close();
                                } else {
                                    bt0Var2.f15569f = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    bt0Var2.f15568e = null;
                                }
                            } catch (Throwable th3) {
                                try {
                                    byteArrayOutputStream.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (IOException e11) {
                            wd3Var.mo10207h(7, e11);
                        } catch (IllegalStateException e12) {
                            wd3Var.mo10207h(8, e12);
                        }
                    }
                    bArr = (byte[]) bt0Var2.f15569f;
                    if (bArr != null) {
                        z = false;
                    } else {
                        try {
                            if (bt0Var2.f15564a) {
                                C1077qn.m9989o("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                try {
                                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                                    try {
                                        fileOutputStream = new FileOutputStream((File) bt0Var2.f15566c);
                                        try {
                                            channel = fileOutputStream.getChannel();
                                            try {
                                                fileLockTryLock = channel.tryLock();
                                                if (fileLockTryLock != null) {
                                                    try {
                                                        if (fileLockTryLock.isValid()) {
                                                            bArr2 = new byte[512];
                                                            while (true) {
                                                                i = byteArrayInputStream.read(bArr2);
                                                                if (i > 0) {
                                                                    break;
                                                                } else {
                                                                    fileOutputStream.write(bArr2, 0, i);
                                                                }
                                                            }
                                                            bt0Var2.m3672e(1, null);
                                                            fileLockTryLock.close();
                                                            channel.close();
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            bt0Var2.f15569f = null;
                                                            bt0Var2.f15568e = null;
                                                            z = true;
                                                        }
                                                    } catch (Throwable th5) {
                                                        if (fileLockTryLock == null) {
                                                            throw th5;
                                                        }
                                                        try {
                                                            fileLockTryLock.close();
                                                            throw th5;
                                                        } catch (Throwable th6) {
                                                            th5.addSuppressed(th6);
                                                            throw th5;
                                                        }
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th;
                                                        } catch (Throwable th7) {
                                                            th.addSuppressed(th7);
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                            } catch (Throwable th8) {
                                                if (channel == null) {
                                                    throw th8;
                                                }
                                                try {
                                                    channel.close();
                                                    throw th8;
                                                } catch (Throwable th9) {
                                                    th8.addSuppressed(th9);
                                                    throw th8;
                                                }
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th10) {
                                                    th.addSuppressed(th10);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th11) {
                                            fileOutputStream.close();
                                            throw th11;
                                        }
                                    } catch (Throwable th12) {
                                        byteArrayInputStream.close();
                                        throw th12;
                                    }
                                } catch (FileNotFoundException e13) {
                                    bt0Var2.m3672e(6, e13);
                                    bt0Var2.f15569f = null;
                                    bt0Var2.f15568e = null;
                                    z = false;
                                }
                            } catch (IOException e14) {
                                bt0Var2.m3672e(7, e14);
                                bt0Var2.f15569f = null;
                                bt0Var2.f15568e = null;
                                z = false;
                            }
                        } catch (Throwable th13) {
                            bt0Var2.f15569f = null;
                            bt0Var2.f15568e = null;
                            throw th13;
                        }
                    }
                    if (z) {
                        y42.m12873v0(packageInfo, filesDir);
                    }
                    z2 = z;
                } catch (Throwable th14) {
                    try {
                        fileInputStreamM3670c.close();
                        throw th14;
                    } catch (IOException e15) {
                        wd3Var5.mo10207h(7, e15);
                        throw th14;
                    }
                }
            } else {
                bt0Var2.m3672e(4, null);
                z2 = false;
            }
            ah3.m2993a(context, z2);
        } catch (PackageManager.NameNotFoundException e16) {
            wd3Var5.mo10207h(7, e16);
            ah3.m2993a(context, false);
        }
    }
}
