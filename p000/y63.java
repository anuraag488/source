package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.VarHandle;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y63 implements qe4 {

    /* JADX INFO: renamed from: a */
    public Context f34949a;

    /* JADX INFO: renamed from: a */
    public ApplicationInfo m12997a(int i, String str) {
        return this.f34949a.getPackageManager().getApplicationInfo(str, i);
    }

    /* JADX INFO: renamed from: b */
    public PackageInfo m12998b(int i, String str) {
        return this.f34949a.getPackageManager().getPackageInfo(str, i);
    }

    /* JADX INFO: renamed from: c */
    public boolean m12999c() {
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f34949a;
        if (callingUid == iMyUid) {
            return y42.m12872u0(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c A[Catch: all -> 0x0028, TryCatch #4 {all -> 0x0028, blocks: (B:6:0x000d, B:8:0x0011, B:10:0x001f, B:20:0x003c, B:74:0x0189, B:15:0x002b, B:17:0x0033, B:21:0x0041, B:23:0x0047, B:24:0x004b, B:73:0x0186, B:75:0x018c, B:76:0x018f, B:77:0x0190, B:25:0x0050, B:27:0x0054, B:28:0x0061, B:30:0x0067, B:36:0x0082, B:38:0x0088, B:39:0x0094, B:60:0x0165, B:61:0x0168, B:69:0x017d, B:68:0x017a, B:70:0x017e, B:71:0x0183, B:72:0x0184, B:31:0x0072, B:35:0x0079), top: B:88:0x000d, inners: #1 }] */
    @Override // p000.qe4
    public Object get() {
        y53 y53Var;
        y53 y53Var2;
        y53 y53Var3;
        char c;
        y53 y53Var4;
        Object obj = le6.f23979g;
        Context contextCreateDeviceProtectedStorageContext = this.f34949a;
        y53 y53Var5 = vd6.f32538a;
        if (y53Var5 != null) {
            return y53Var5;
        }
        synchronized (vd6.class) {
            try {
                y53 y53Var6 = vd6.f32538a;
                y53Var = y53Var6;
                if (y53Var6 == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    C0805jo c0805jo = he6.f20522a;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        y53Var4 = C1275w.f32997a;
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        if (!contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                            contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                        }
                        Context context = contextCreateDeviceProtectedStorageContext;
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            char c2 = 0;
                            try {
                                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                                if (file.exists()) {
                                    af3 af3Var = new af3();
                                    af3Var.f14440a = file;
                                    VarHandle.storeStoreFence();
                                    y53Var2 = af3Var;
                                } else {
                                    y53Var2 = C1275w.f32997a;
                                }
                            } catch (RuntimeException e) {
                                Log.e("HermeticFileOverrides", "no data dir", e);
                                y53Var2 = C1275w.f32997a;
                            }
                            if (y53Var2.mo2967b()) {
                                File file2 = (File) y53Var2.mo2966a();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        x64 x64Var = new x64(0);
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                StringBuilder sb = new StringBuilder(line.length() + 9);
                                                sb.append("Invalid: ");
                                                sb.append(line);
                                                Log.e("HermeticFileOverrides", sb.toString());
                                            } else {
                                                String str3 = new String(strArrSplit[c2]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                x64 x64Var2 = (x64) x64Var.get(str3);
                                                if (x64Var2 == null) {
                                                    c = 0;
                                                    x64Var2 = new x64(0);
                                                    x64Var.put(str3, x64Var2);
                                                } else {
                                                    c = 0;
                                                }
                                                x64Var2.put(strDecode, strDecode2);
                                                c2 = c;
                                            }
                                        }
                                        String string = file2.toString();
                                        String packageName = context.getPackageName();
                                        StringBuilder sb2 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                        sb2.append("Parsed ");
                                        sb2.append(string);
                                        sb2.append(" for Android package ");
                                        sb2.append(packageName);
                                        Log.w("HermeticFileOverrides", sb2.toString());
                                        kd6 kd6Var = new kd6();
                                        kd6Var.f23079a = x64Var;
                                        VarHandle.storeStoreFence();
                                        bufferedReader.close();
                                        af3 af3Var2 = new af3();
                                        af3Var2.f14440a = kd6Var;
                                        VarHandle.storeStoreFence();
                                        y53Var3 = af3Var2;
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } else {
                                y53Var3 = C1275w.f32997a;
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            y53Var4 = y53Var3;
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        y53Var4 = C1275w.f32997a;
                    }
                    vd6.f32538a = y53Var4;
                    y53Var = y53Var4;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return y53Var;
    }
}
