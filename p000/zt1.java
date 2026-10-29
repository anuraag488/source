package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zt1 {

    /* JADX INFO: renamed from: c */
    public static zt1 f36355c;

    /* JADX INFO: renamed from: a */
    public Object f36356a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    public volatile Object f36357b;

    /* JADX INFO: renamed from: a */
    public static zt1 m13748a(Context context) {
        zt1 zt1Var;
        y42.m12854a0(context);
        synchronized (zt1.class) {
            zt1Var = f36355c;
            if (zt1Var == null) {
                sy5 sy5Var = rk6.f29380a;
                synchronized (rk6.class) {
                    if (rk6.f29384e == null) {
                        rk6.f29384e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                zt1Var = new zt1();
                zt1Var.f36356a = context.getApplicationContext();
                VarHandle.storeStoreFence();
                f36355c = zt1Var;
            }
        }
        return zt1Var;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m13749c(PackageInfo packageInfo, boolean z) {
        fp5 fp5Var;
        int i;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                fp5 fp5Var2 = z ? fj6.f19050c : fj6.f19049b;
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                    bo5 bo5Var = vo5.f32765d;
                    fp5Var = fp5.f19216g;
                } else {
                    bo5 bo5Var2 = vo5.f32765d;
                    Object[] objArrCopyOf = new Object[4];
                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    int length = signingCertificateHistory.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        byte[] byteArray = signingCertificateHistory[i2].toByteArray();
                        byteArray.getClass();
                        int length2 = objArrCopyOf.length;
                        int i4 = i3 + 1;
                        if (i4 < 0) {
                            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                        }
                        if (i4 <= length2) {
                            i = length2;
                        } else {
                            i = (length2 >> 1) + length2 + 1;
                            if (i < i4) {
                                int iHighestOneBit = Integer.highestOneBit(i3);
                                i = iHighestOneBit + iHighestOneBit;
                            }
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                        if (i > length2) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
                        }
                        objArrCopyOf[i3] = byteArray;
                        i2++;
                        i3 = i4;
                    }
                    fp5Var = i3 == 0 ? fp5.f19216g : new fp5(i3, objArrCopyOf);
                }
                if (fp5Var.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                vo5 vo5VarMo6848m = fp5Var.mo6848m();
                int size = vo5VarMo6848m.size();
                int i5 = 0;
                while (i5 < size) {
                    byte[] bArr = (byte[]) vo5VarMo6848m.get(i5);
                    bo5 bo5VarListIterator = fp5Var2.listIterator(0);
                    do {
                        int i6 = i5 + 1;
                        if (!bo5VarListIterator.hasNext()) {
                            i5 = i6;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) bo5VarListIterator.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z ? m13750d(packageInfo, fj6.f19048a) : m13750d(packageInfo, fj6.f19048a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static fc6 m13750d(PackageInfo packageInfo, fc6... fc6VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            ge6 ge6Var = new ge6(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < fc6VarArr.length; i++) {
                if (fc6VarArr[i].equals(ge6Var)) {
                    return fc6VarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01c2  */
    /* JADX INFO: renamed from: b */
    public boolean m13751b(int i) {
        rd6 rd6VarM10300j;
        int length;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = ((Context) this.f36356a).getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            rd6VarM10300j = rd6.m10300j("no pkgs");
        } else {
            rd6VarM10300j = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    y42.m12854a0(rd6VarM10300j);
                    break;
                }
                String str = packagesForUid[i2];
                if (str == null) {
                    rd6VarM10300j = rd6.m10300j("null pkg");
                } else if (str.equals((String) this.f36357b)) {
                    rd6VarM10300j = rd6.f29194f;
                } else {
                    sy5 sy5Var = rk6.f29380a;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            rk6.m10351a();
                            boolean zM8042N = ((ln5) rk6.f29382c).m8042N();
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            if (zM8042N) {
                                boolean zM13236b = yt1.m13236b((Context) this.f36356a);
                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                                try {
                                    y42.m12854a0(rk6.f29384e);
                                    try {
                                        rk6.m10351a();
                                        y42.m12854a0(rk6.f29384e);
                                        Context context = (Context) v23.m11710J(v23.m11709I(v23.m11711K(rk6.f29384e)));
                                        try {
                                            ln5 ln5Var = (ln5) rk6.f29382c;
                                            Parcel parcelM7550G = ln5Var.m7550G();
                                            int i3 = nv5.f26127a;
                                            parcelM7550G.writeInt(1);
                                            int iM9092Q = oh6.m9092Q(parcelM7550G, 20293);
                                            oh6.m9088M(parcelM7550G, 1, str);
                                            oh6.m9091P(parcelM7550G, 2, 4);
                                            parcelM7550G.writeInt(zM13236b ? 1 : 0);
                                            oh6.m9091P(parcelM7550G, 3, 4);
                                            parcelM7550G.writeInt(0);
                                            oh6.m9086K(parcelM7550G, 4, v23.m11711K(context));
                                            oh6.m9091P(parcelM7550G, 5, 4);
                                            parcelM7550G.writeInt(0);
                                            oh6.m9091P(parcelM7550G, 6, 4);
                                            parcelM7550G.writeInt(1);
                                            oh6.m9091P(parcelM7550G, 8, 4);
                                            parcelM7550G.writeInt(0);
                                            oh6.m9094S(parcelM7550G, iM9092Q);
                                            Parcel parcelM7548E = ln5Var.m7548E(parcelM7550G, 6);
                                            fp6 fp6Var = (fp6) nv5.m8862a(parcelM7548E, fp6.CREATOR);
                                            parcelM7548E.recycle();
                                            if (fp6Var.f19219d) {
                                                jv5.m7299a(fp6Var.f19222g);
                                                rd6VarM10300j = new rd6(null, true, null);
                                            } else {
                                                String str2 = fp6Var.f19220e;
                                                PackageManager.NameNotFoundException nameNotFoundException = z16.m13289a(fp6Var.f19221f) == 4 ? new PackageManager.NameNotFoundException() : null;
                                                if (str2 == null) {
                                                    str2 = "error checking package certificate";
                                                }
                                                jv5.m7299a(fp6Var.f19222g);
                                                z16.m13289a(fp6Var.f19221f);
                                                rd6VarM10300j = new rd6(str2, false, nameNotFoundException);
                                            }
                                        } catch (RemoteException e) {
                                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                                            rd6VarM10300j = rd6.m10301k("module call", e);
                                        }
                                    } catch (a51 e2) {
                                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                        rd6VarM10300j = rd6.m10301k("module init: ".concat(String.valueOf(e2.getMessage())), e2);
                                    }
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                } catch (Throwable th) {
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                    throw th;
                                }
                            } else {
                                try {
                                    PackageInfo packageInfo = ((Context) this.f36356a).getPackageManager().getPackageInfo(str, 134217792);
                                    boolean zM13236b2 = yt1.m13236b((Context) this.f36356a);
                                    if (packageInfo == null) {
                                        rd6VarM10300j = rd6.m10300j("null pkg");
                                    } else {
                                        Signature[] signatureArr = packageInfo.signatures;
                                        if (signatureArr == null || signatureArr.length != 1) {
                                            rd6VarM10300j = rd6.m10300j("single cert required");
                                        } else {
                                            ge6 ge6Var = new ge6(packageInfo.signatures[0].toByteArray());
                                            String str3 = packageInfo.packageName;
                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                            try {
                                                rd6 rd6VarM10352b = rk6.m10352b(str3, ge6Var, zM13236b2, false);
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                if (rd6VarM10352b.f29196b && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                    try {
                                                        rd6 rd6VarM10352b2 = rk6.m10352b(str3, ge6Var, false, true);
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        if (rd6VarM10352b2.f29196b) {
                                                            rd6VarM10300j = rd6.m10300j("debuggable release cert app rejected");
                                                        }
                                                    } catch (Throwable th2) {
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        throw th2;
                                                    }
                                                }
                                                rd6VarM10300j = rd6VarM10352b;
                                            } catch (Throwable th3) {
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                throw th3;
                                            }
                                        }
                                    }
                                    if (rd6VarM10300j.f29196b) {
                                        this.f36357b = str;
                                    }
                                } catch (PackageManager.NameNotFoundException e3) {
                                    rd6VarM10300j = rd6.m10301k("no pkg ".concat(str), e3);
                                }
                            }
                        } catch (a51 | RemoteException e4) {
                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                        if (rd6VarM10300j.f29196b) {
                            this.f36357b = str;
                        }
                    } catch (Throwable th4) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th4;
                    }
                }
                if (rd6VarM10300j.f29196b) {
                    break;
                }
                i2++;
            }
        }
        if (!rd6VarM10300j.f29196b && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th5 = (Throwable) rd6VarM10300j.f29198d;
            if (th5 != null) {
                Log.d("GoogleCertificatesRslt", rd6VarM10300j.mo10306e(), th5);
            } else {
                Log.d("GoogleCertificatesRslt", rd6VarM10300j.mo10306e());
            }
        }
        return rd6VarM10300j.f29196b;
    }
}
