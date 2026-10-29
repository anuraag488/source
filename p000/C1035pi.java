package p000;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;

/* JADX INFO: renamed from: pi */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1035pi extends ue2 implements yp1 {

    /* JADX INFO: renamed from: j */
    public static final C1035pi f27612j;

    /* JADX INFO: renamed from: k */
    public static final C1035pi f27613k;

    /* JADX INFO: renamed from: l */
    public static final C1035pi f27614l;

    /* JADX INFO: renamed from: m */
    public static final C1035pi f27615m;

    /* JADX INFO: renamed from: n */
    public static final C1035pi f27616n;

    /* JADX INFO: renamed from: o */
    public static final C1035pi f27617o;

    /* JADX INFO: renamed from: p */
    public static final C1035pi f27618p;

    /* JADX INFO: renamed from: q */
    public static final C1035pi f27619q;

    /* JADX INFO: renamed from: r */
    public static final C1035pi f27620r;

    /* JADX INFO: renamed from: s */
    public static final C1035pi f27621s;

    /* JADX INFO: renamed from: t */
    public static final C1035pi f27622t;

    /* JADX INFO: renamed from: u */
    public static final C1035pi f27623u;

    /* JADX INFO: renamed from: v */
    public static final C1035pi f27624v;

    /* JADX INFO: renamed from: w */
    public static final C1035pi f27625w;

    /* JADX INFO: renamed from: x */
    public static final C1035pi f27626x;

    /* JADX INFO: renamed from: y */
    public static final C1035pi f27627y;

    /* JADX INFO: renamed from: z */
    public static final C1035pi f27628z;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f27629i;

    static {
        int i = 1;
        f27612j = new C1035pi(i, (byte) 0);
        f27613k = new C1035pi(i, (byte) 1);
        f27614l = new C1035pi(i, (byte) 2);
        f27615m = new C1035pi(i, (byte) 3);
        f27616n = new C1035pi(i, (byte) 4);
        f27617o = new C1035pi(i, (byte) 5);
        f27618p = new C1035pi(i, (byte) 6);
        f27619q = new C1035pi(i, (byte) 7);
        f27620r = new C1035pi(i, (byte) 8);
        f27621s = new C1035pi(i, (byte) 9);
        f27622t = new C1035pi(i, (byte) 10);
        f27623u = new C1035pi(i, (byte) 11);
        f27624v = new C1035pi(i, (byte) 12);
        f27625w = new C1035pi(i, (byte) 13);
        f27626x = new C1035pi(i, (byte) 14);
        f27627y = new C1035pi(i, (byte) 15);
        f27628z = new C1035pi(i, (byte) 16);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1035pi(int i, byte b) {
        super(i);
        this.f27629i = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        String strMyProcessName = "";
        switch (this.f27629i) {
            case 0:
                return obj;
            case 1:
                return null;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 4:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 5:
                long jM9463b = pb0.m9463b(((pb0) obj).f27503a, oc0.f26570x);
                return new C0615ek(pb0.m9465d(jM9463b), pb0.m9469h(jM9463b), pb0.m9468g(jM9463b), pb0.m9466e(jM9463b));
            case 6:
                return obj;
            case 7:
                long j = ((to4) obj).f31294a;
                return new C0530ck(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            case 8:
                C0530ck c0530ck = (C0530ck) obj;
                return to4.m11080a(zp0.m13673e(c0530ck.f16071a, c0530ck.f16072b));
            case 9:
                return qq2.m10014I(0.0f, 0.0f, null, 7);
            case 10:
                long j2 = ((w52) obj).f33109a;
                return o52.m8954a(0L);
            case 11:
                return w52.m12106a(((w52) obj).f33109a);
            case 12:
                return k91.f23006d;
            case 13:
                gp0 gp0Var = (gp0) obj;
                StringBuilder sb = new StringBuilder("CorruptionException in settings DataStore in ");
                if (Build.VERSION.SDK_INT > 33) {
                    strMyProcessName = Process.myProcessName();
                } else {
                    String processName = Application.getProcessName();
                    if (processName != null || (processName = C0638f5.m5551v()) != null) {
                        strMyProcessName = processName;
                    }
                }
                sb.append(strMyProcessName);
                sb.append('.');
                Log.w(FirebaseSessionsRegistrar.TAG, sb.toString(), gp0Var);
                return new hw2(true);
            case 14:
                gp0 gp0Var2 = (gp0) obj;
                StringBuilder sb2 = new StringBuilder("CorruptionException in sessions DataStore in ");
                if (Build.VERSION.SDK_INT > 33) {
                    strMyProcessName = Process.myProcessName();
                } else {
                    String processName2 = Application.getProcessName();
                    if (processName2 != null || (processName2 = C0638f5.m5551v()) != null) {
                        strMyProcessName = processName2;
                    }
                }
                sb2.append(strMyProcessName);
                sb2.append('.');
                Log.w(FirebaseSessionsRegistrar.TAG, sb2.toString(), gp0Var2);
                return new hw2(true);
            case 15:
                return ju4.f22634a;
            case 16:
                return Boolean.TRUE;
            case 17:
                return w52.m12106a((((long) ((int) (((w52) obj).f33109a >> 32))) << 32) | (((long) 0) & 4294967295L));
            default:
                return w52.m12106a((((long) ((int) (((w52) obj).f33109a >> 32))) << 32) | (((long) 0) & 4294967295L));
        }
    }
}
