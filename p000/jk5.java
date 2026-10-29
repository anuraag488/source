package p000;

import ads_mobile_sdk.j11;
import ads_mobile_sdk.l11;
import ads_mobile_sdk.q11;
import ads_mobile_sdk.r11;
import ads_mobile_sdk.ys0;
import android.content.Context;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jk5 implements dr6, ut5, d51 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ jk5 f22352b = new jk5(2);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ jk5 f22353c = new jk5(3);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ jk5 f22354d = new jk5(4);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ jk5 f22355e = new jk5(5);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ jk5 f22356f = new jk5(6);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ jk5 f22357g = new jk5(7);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ jk5 f22358h = new jk5(8);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ jk5 f22359i = new jk5(9);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ jk5 f22360j = new jk5(10);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ jk5 f22361k = new jk5(11);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ jk5 f22362l = new jk5(12);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ jk5 f22363m = new jk5(13);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ jk5 f22364n = new jk5(14);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ jk5 f22365o = new jk5(15);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ jk5 f22366p = new jk5(16);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ jk5 f22367q = new jk5(17);

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ jk5 f22368r = new jk5(18);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ jk5 f22369s = new jk5(19);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ jk5 f22370t = new jk5(20);

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ jk5 f22371u = new jk5(21);

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ jk5 f22372v = new jk5(22);

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ jk5 f22373w = new jk5(23);

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ jk5 f22374x = new jk5(24);

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ jk5 f22375y = new jk5(25);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22376a;

    public /* synthetic */ jk5(byte b) {
        this.f22376a = b;
    }

    /* JADX INFO: renamed from: b */
    public static ys0 m7137b(mi5 mi5Var) {
        if (mi5Var instanceof q11) {
            return ys0.f13826c;
        }
        if (mi5Var instanceof r11) {
            return ys0.f13828e;
        }
        if (mi5Var instanceof j11) {
            return ((j11) mi5Var).f5514c instanceof CancellationException ? ys0.f13830g : ys0.f13831h;
        }
        if (!(mi5Var instanceof l11)) {
            return ys0.f13832i;
        }
        int iIntValue = ((l11) mi5Var).f6569c.m10907U().intValue();
        lm2 lm2Var = lm2.f24159b;
        if (iIntValue == 7) {
            return ys0.f13829f;
        }
        return iIntValue == 3 ? ys0.f13827d : ys0.f13832i;
    }

    @Override // p000.d51
    /* JADX INFO: renamed from: a */
    public c51 mo4355a(Context context, String str, b51 b51Var) {
        int iMo3005a;
        int i = -1;
        switch (this.f22376a) {
            case 26:
                c51 c51Var = new c51();
                int iMo3006b = b51Var.mo3006b(context, str);
                c51Var.f15808a = iMo3006b;
                if (iMo3006b != 0) {
                    c51Var.f15810c = -1;
                } else {
                    int iMo3005a2 = b51Var.mo3005a(context, str, true);
                    c51Var.f15809b = iMo3005a2;
                    if (iMo3005a2 != 0) {
                        c51Var.f15810c = 1;
                    }
                }
                return c51Var;
            default:
                c51 c51Var2 = new c51();
                int iMo3006b2 = b51Var.mo3006b(context, str);
                c51Var2.f15808a = iMo3006b2;
                int i2 = 0;
                if (iMo3006b2 != 0) {
                    iMo3005a = b51Var.mo3005a(context, str, false);
                    c51Var2.f15809b = iMo3005a;
                } else {
                    iMo3005a = b51Var.mo3005a(context, str, true);
                    c51Var2.f15809b = iMo3005a;
                }
                int i3 = c51Var2.f15808a;
                if (i3 == 0) {
                    if (iMo3005a == 0) {
                        i = 0;
                    }
                    c51Var2.f15810c = i;
                    return c51Var2;
                }
                i2 = i3;
                if (i2 < iMo3005a) {
                    i = 1;
                }
                c51Var2.f15810c = i;
                return c51Var2;
        }
    }

    @Override // p000.ut5
    /* JADX INFO: renamed from: f */
    public Object mo3008f() {
        switch (this.f22376a) {
            case 2:
                return new Boolean(((Boolean) rm6.f29428b.m7959b()).booleanValue());
            case 3:
                List list = e56.f17769a;
                ho6.f20761b.get();
                Boolean bool = (Boolean) ko6.f23299c.m7959b();
                bool.getClass();
                return bool;
            case 4:
                List list2 = e56.f17769a;
                zl6.f36172b.get();
                return (String) gm6.f19937l.m7959b();
            case 5:
                List list3 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19949r.m7959b()).longValue());
            case 6:
                List list4 = e56.f17769a;
                zl6.f36172b.get();
                Long l = (Long) gm6.f19908T.m7959b();
                l.getClass();
                return l;
            case 7:
                List list5 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19899K.m7959b()).longValue());
            case 8:
                List list6 = e56.f17769a;
                zl6.f36172b.get();
                Long l2 = (Long) gm6.f19906R.m7959b();
                l2.getClass();
                return l2;
            case 9:
                List list7 = e56.f17769a;
                zl6.f36172b.get();
                Long l3 = (Long) gm6.f19958v0.m7959b();
                l3.getClass();
                return l3;
            case 10:
                List list8 = e56.f17769a;
                zl6.f36172b.get();
                Long l4 = (Long) gm6.f19962y.m7959b();
                l4.getClass();
                return l4;
            case 11:
                List list9 = e56.f17769a;
                zl6.f36172b.get();
                Long l5 = (Long) gm6.f19954t0.m7959b();
                l5.getClass();
                return l5;
            case 12:
                List list10 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19953t.m7959b()).longValue());
            case 13:
                List list11 = e56.f17769a;
                zl6.f36172b.get();
                return (String) gm6.f19927g.m7959b();
            case 14:
                List list12 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19951s.m7959b()).longValue());
            case 15:
                List list13 = e56.f17769a;
                zl6.f36172b.get();
                Long l6 = (Long) gm6.f19922d0.m7959b();
                l6.getClass();
                return l6;
            case 16:
                List list14 = e56.f17769a;
                zl6.f36172b.get();
                return (String) gm6.f19920c0.m7959b();
            case 17:
                List list15 = e56.f17769a;
                zl6.f36172b.get();
                return (String) gm6.f19892D.m7959b();
            case 18:
                List list16 = e56.f17769a;
                zl6.f36172b.get();
                Long l7 = (Long) gm6.f19914Z.m7959b();
                l7.getClass();
                return l7;
            case 19:
                List list17 = e56.f17769a;
                zl6.f36172b.get();
                Boolean bool2 = (Boolean) gm6.f19919c.m7959b();
                bool2.getClass();
                return bool2;
            case 20:
                List list18 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19932i0.m7959b()).longValue());
            case 21:
                List list19 = e56.f17769a;
                return Integer.valueOf((int) ((Long) mm6.f25039a.m7959b()).longValue());
            case 22:
                List list20 = e56.f17769a;
                Boolean bool3 = (Boolean) vo6.f32766a.m7959b();
                bool3.getClass();
                return bool3;
            case 23:
                List list21 = e56.f17769a;
                ho6.f20761b.get();
                Boolean bool4 = (Boolean) ko6.f23304h.m7959b();
                bool4.getClass();
                return bool4;
            case 24:
                List list22 = e56.f17769a;
                Boolean bool5 = (Boolean) vm6.f32744a.m7959b();
                bool5.getClass();
                return bool5;
            default:
                List list23 = e56.f17769a;
                zl6.f36172b.get();
                Long l8 = (Long) gm6.f19915a.m7959b();
                l8.getClass();
                return l8;
        }
    }

    @Override // p000.dr6
    /* JADX INFO: renamed from: j */
    public Object mo4146j() {
        return new un5();
    }
}
