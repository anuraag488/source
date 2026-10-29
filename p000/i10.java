package p000;

import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i10 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ i10[] f20997c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ v91 f20998d;

    /* JADX INFO: renamed from: a */
    public final g12 f20999a;

    /* JADX INFO: renamed from: b */
    public final pg0 f21000b;

    static {
        g12 g12VarM5449e = C0638f5.f18761o;
        if (g12VarM5449e == null) {
            f12 f12Var = new f12("Filled.Home", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = uw4.f32218a;
            ga4 ga4Var = new ga4(pb0.f27495b);
            tv1 tv1Var = new tv1((byte) 1);
            tv1Var.m11175k(10.0f, 20.0f);
            tv1Var.m11180p(-6.0f);
            tv1Var.m11172h(4.0f);
            tv1Var.m11180p(6.0f);
            tv1Var.m11172h(5.0f);
            tv1Var.m11180p(-8.0f);
            tv1Var.m11172h(3.0f);
            tv1Var.m11173i(12.0f, 3.0f);
            tv1Var.m11173i(2.0f, 12.0f);
            tv1Var.m11172h(3.0f);
            tv1Var.m11180p(8.0f);
            tv1Var.m11168d();
            f12.m5445c(f12Var, tv1Var.f31466a, ga4Var, 1.0f, 1.0f, 2, 1.0f, 14336);
            g12VarM5449e = f12Var.m5449e();
            C0638f5.f18761o = g12VarM5449e;
        }
        i10 i10Var = new i10("Settings", 0, g12VarM5449e, zy5.f36483l);
        g12 g12VarM5449e2 = ks5.f23406o;
        if (g12VarM5449e2 == null) {
            f12 f12Var2 = new f12("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = uw4.f32218a;
            ga4 ga4Var2 = new ga4(pb0.f27495b);
            tv1 tv1Var2 = new tv1((byte) 1);
            tv1Var2.m11175k(3.0f, 17.25f);
            j93 j93Var = new j93(21.0f);
            ArrayList arrayList = tv1Var2.f31466a;
            arrayList.add(j93Var);
            tv1Var2.m11172h(3.75f);
            tv1Var2.m11173i(17.81f, 9.94f);
            tv1Var2.m11174j(-3.75f, -3.75f);
            tv1Var2.m11173i(3.0f, 17.25f);
            tv1Var2.m11168d();
            tv1Var2.m11175k(20.71f, 7.04f);
            tv1Var2.m11170f(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
            tv1Var2.m11174j(-2.34f, -2.34f);
            tv1Var2.m11170f(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
            tv1Var2.m11174j(-1.83f, 1.83f);
            tv1Var2.m11174j(3.75f, 3.75f);
            tv1Var2.m11174j(1.83f, -1.83f);
            tv1Var2.m11168d();
            f12.m5445c(f12Var2, arrayList, ga4Var2, 1.0f, 1.0f, 2, 1.0f, 14336);
            g12VarM5449e2 = f12Var2.m5449e();
            ks5.f23406o = g12VarM5449e2;
        }
        i10[] i10VarArr = {i10Var, new i10("Buttons", 1, g12VarM5449e2, zy5.f36484m), new i10("Gestures", 2, (g12) o02.f26257n.getValue(), zy5.f36485n)};
        f20997c = i10VarArr;
        f20998d = vd6.m11859r(i10VarArr);
    }

    public i10(String str, int i, g12 g12Var, pg0 pg0Var) {
        super(str, i);
        this.f20999a = g12Var;
        this.f21000b = pg0Var;
    }

    public static i10 valueOf(String str) {
        return (i10) Enum.valueOf(i10.class, str);
    }

    public static i10[] values() {
        return (i10[]) f20997c.clone();
    }
}
