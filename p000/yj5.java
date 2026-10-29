package p000;

import ads_mobile_sdk.bw1;
import android.content.Context;
import android.os.Looper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yj5 implements t65, ut5, d51 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ yj5 f35268b = new yj5(2);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ yj5 f35269c = new yj5(3);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ yj5 f35270d = new yj5(4);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ yj5 f35271e = new yj5(5);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ yj5 f35272f = new yj5(6);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ yj5 f35273g = new yj5(7);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ yj5 f35274h = new yj5(8);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ yj5 f35275i = new yj5(9);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ yj5 f35276j = new yj5(10);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ yj5 f35277k = new yj5(11);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ yj5 f35278l = new yj5(12);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ yj5 f35279m = new yj5(13);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ yj5 f35280n = new yj5(14);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ yj5 f35281o = new yj5(15);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ yj5 f35282p = new yj5(16);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ yj5 f35283q = new yj5(17);

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ yj5 f35284r = new yj5(18);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ yj5 f35285s = new yj5(19);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ yj5 f35286t = new yj5(20);

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ yj5 f35287u = new yj5(21);

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ yj5 f35288v = new yj5(22);

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ yj5 f35289w = new yj5(23);

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ yj5 f35290x = new yj5(24);

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ yj5 f35291y = new yj5(25);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35292a;

    public /* synthetic */ yj5(byte b) {
        this.f35292a = b;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m13150b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[DONT_INVERT, PHI: r5
  0x0021: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:5:0x001a, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.d51
    /* JADX INFO: renamed from: a */
    public c51 mo4355a(Context context, String str, b51 b51Var) {
        int i = -1;
        switch (this.f35292a) {
            case 26:
                c51 c51Var = new c51();
                int iMo3005a = b51Var.mo3005a(context, str, true);
                c51Var.f15809b = iMo3005a;
                if (iMo3005a != 0) {
                    c51Var.f15810c = 1;
                } else {
                    int iMo3006b = b51Var.mo3006b(context, str);
                    c51Var.f15808a = iMo3006b;
                    if (iMo3006b != 0) {
                        c51Var.f15810c = -1;
                    }
                }
                return c51Var;
            default:
                c51 c51Var2 = new c51();
                c51Var2.f15808a = b51Var.mo3006b(context, str);
                int iMo3005a2 = b51Var.mo3005a(context, str, true);
                c51Var2.f15809b = iMo3005a2;
                int i2 = c51Var2.f15808a;
                if (i2 == 0) {
                    i2 = 0;
                    if (iMo3005a2 == 0) {
                        i = 0;
                    } else if (i2 < iMo3005a2) {
                        i = 1;
                    }
                } else if (i2 < iMo3005a2) {
                    i = 1;
                }
                c51Var2.f15810c = i;
                return c51Var2;
        }
    }

    @Override // p000.ut5
    /* JADX INFO: renamed from: f */
    public Object mo3008f() {
        switch (this.f35292a) {
            case 2:
                return new Boolean(((Boolean) rm6.f29427a.m7959b()).booleanValue());
            case 3:
                List list = e56.f17769a;
                zl6.f36172b.get();
                Long l = (Long) gm6.f19917b.m7959b();
                l.getClass();
                return l;
            case 4:
                List list2 = e56.f17769a;
                zl6.f36172b.get();
                return (String) gm6.f19923e.m7959b();
            case 5:
                List list3 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19948q0.m7959b()).longValue());
            case 6:
                List list4 = e56.f17769a;
                zl6.f36172b.get();
                return (String) gm6.f19902N.m7959b();
            case 7:
                List list5 = e56.f17769a;
                zl6.f36172b.get();
                Long l2 = (Long) gm6.f19900L.m7959b();
                l2.getClass();
                return l2;
            case 8:
                List list6 = e56.f17769a;
                zl6.f36172b.get();
                Long l3 = (Long) gm6.f19907S.m7959b();
                l3.getClass();
                return l3;
            case 9:
                List list7 = e56.f17769a;
                zl6.f36172b.get();
                Long l4 = (Long) gm6.f19926f0.m7959b();
                l4.getClass();
                return l4;
            case 10:
                List list8 = e56.f17769a;
                zl6.f36172b.get();
                Long l5 = (Long) gm6.f19963z.m7959b();
                l5.getClass();
                return l5;
            case 11:
                List list9 = e56.f17769a;
                zl6.f36172b.get();
                return (String) gm6.f19929h.m7959b();
            case 12:
                List list10 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19943o.m7959b()).longValue());
            case 13:
                List list11 = e56.f17769a;
                eo6.f18344b.get();
                return (String) go6.f20002f.m7959b();
            case 14:
                List list12 = e56.f17769a;
                eo6.f18344b.get();
                Double d = (Double) go6.f19999c.m7959b();
                d.getClass();
                return d;
            case 15:
                List list13 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19921d.m7959b()).longValue());
            case 16:
                List list14 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19945p.m7959b()).longValue());
            case 17:
                List list15 = e56.f17769a;
                zl6.f36172b.get();
                Long l6 = (Long) gm6.f19933j.m7959b();
                l6.getClass();
                return l6;
            case 18:
                List list16 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19950r0.m7959b()).longValue());
            case 19:
                List list17 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19957v.m7959b()).longValue());
            case 20:
                List list18 = e56.f17769a;
                Boolean bool = (Boolean) gn6.f19984a.m7959b();
                bool.getClass();
                return bool;
            case 21:
                List list19 = e56.f17769a;
                Boolean bool2 = (Boolean) sp6.f30487a.m7959b();
                bool2.getClass();
                return bool2;
            case 22:
                List list20 = e56.f17769a;
                Boolean bool3 = (Boolean) en6.f18283b.m7959b();
                bool3.getClass();
                return bool3;
            case 23:
                List list21 = e56.f17769a;
                ho6.f20761b.get();
                Boolean bool4 = (Boolean) ko6.f23297a.m7959b();
                bool4.getClass();
                return bool4;
            case 24:
                List list22 = e56.f17769a;
                Boolean bool5 = (Boolean) vm6.f32745b.m7959b();
                bool5.getClass();
                return bool5;
            default:
                List list23 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19942n0.m7959b()).longValue());
        }
    }

    @Override // p000.t65
    /* JADX INFO: renamed from: a */
    public Object mo5605a(int i) {
        bw1 bw1VarM531a = bw1.m531a(i);
        return bw1VarM531a == null ? bw1.f1521C2 : bw1VarM531a;
    }
}
