package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class rk6 {

    /* JADX INFO: renamed from: a */
    public static final sy5 f29380a;

    /* JADX INFO: renamed from: b */
    public static final sy5 f29381b;

    /* JADX INFO: renamed from: c */
    public static volatile zn5 f29382c;

    /* JADX INFO: renamed from: d */
    public static final Object f29383d;

    /* JADX INFO: renamed from: e */
    public static Context f29384e;

    static {
        new sy5(fc6.m5639K("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"), (byte) 0);
        new sy5(fc6.m5639K("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"), (byte) 1);
        new sy5(fc6.m5639K("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), (byte) 2);
        new sy5(fc6.m5639K("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), (byte) 3);
        f29380a = new sy5(fc6.m5639K("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), (byte) 4);
        f29381b = new sy5(fc6.m5639K("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), (byte) 5);
        f29383d = new Object();
    }

    /* JADX INFO: renamed from: a */
    public static void m10351a() {
        zn5 ln5Var;
        if (f29382c != null) {
            return;
        }
        y42.m12854a0(f29384e);
        synchronized (f29383d) {
            try {
                if (f29382c == null) {
                    IBinder iBinderM4933b = e51.m4927c(f29384e, e51.f17695e, "com.google.android.gms.googlecertificates").m4933b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = pn5.f27848j;
                    if (iBinderM4933b == null) {
                        ln5Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderM4933b.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        ln5Var = iInterfaceQueryLocalInterface instanceof zn5 ? (zn5) iInterfaceQueryLocalInterface : new ln5(iBinderM4933b, "com.google.android.gms.common.internal.IGoogleCertificatesApi", (byte) 2);
                    }
                    f29382c = ln5Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static rd6 m10352b(String str, ge6 ge6Var, boolean z, boolean z2) {
        try {
            m10351a();
            y42.m12854a0(f29384e);
            try {
                zn5 zn5Var = f29382c;
                v23 v23VarM11711K = v23.m11711K(f29384e.getPackageManager());
                ln5 ln5Var = (ln5) zn5Var;
                Parcel parcelM7550G = ln5Var.m7550G();
                int i = nv5.f26127a;
                boolean z3 = true;
                parcelM7550G.writeInt(1);
                int iM9092Q = oh6.m9092Q(parcelM7550G, 20293);
                oh6.m9088M(parcelM7550G, 1, str);
                oh6.m9086K(parcelM7550G, 2, ge6Var);
                oh6.m9091P(parcelM7550G, 3, 4);
                parcelM7550G.writeInt(z ? 1 : 0);
                oh6.m9091P(parcelM7550G, 4, 4);
                parcelM7550G.writeInt(z2 ? 1 : 0);
                oh6.m9094S(parcelM7550G, iM9092Q);
                nv5.m8863b(parcelM7550G, v23VarM11711K);
                Parcel parcelM7548E = ln5Var.m7548E(parcelM7550G, 5);
                if (parcelM7548E.readInt() == 0) {
                    z3 = false;
                }
                parcelM7548E.recycle();
                if (z3) {
                    return rd6.f29194f;
                }
                yf6 yf6Var = new yf6();
                yf6Var.f35199a = z;
                yf6Var.f35200b = str;
                yf6Var.f35201c = ge6Var;
                VarHandle.storeStoreFence();
                sr6 sr6Var = new sr6(null, false, null);
                sr6Var.f30530g = yf6Var;
                VarHandle.storeStoreFence();
                return sr6Var;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return rd6.m10301k("module call", e);
            }
        } catch (a51 e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return rd6.m10301k("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }
}
