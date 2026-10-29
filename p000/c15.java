package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class c15 {

    /* JADX INFO: renamed from: a */
    public static final lv2 f15756a;

    /* JADX INFO: renamed from: b */
    public static final a15[] f15757b;

    static {
        lv2 lv2Var = new lv2(8);
        a15.f55a.getClass();
        b15 b15Var = z05.f35684g;
        lv2Var.m8121h(1, b15Var);
        b15 b15Var2 = z05.f35683f;
        lv2Var.m8121h(2, b15Var2);
        b15 b15Var3 = z05.f35679b;
        lv2Var.m8121h(4, b15Var3);
        b15 b15Var4 = z05.f35681d;
        lv2Var.m8121h(8, b15Var4);
        b15 b15Var5 = z05.f35685h;
        lv2Var.m8121h(16, b15Var5);
        b15 b15Var6 = z05.f35682e;
        lv2Var.m8121h(32, b15Var6);
        b15 b15Var7 = z05.f35686i;
        lv2Var.m8121h(64, b15Var7);
        b15 b15Var8 = z05.f35680c;
        lv2Var.m8121h(128, b15Var8);
        f15756a = lv2Var;
        f15757b = new a15[]{b15Var, b15Var2, b15Var3, b15Var7, b15Var5, b15Var6, b15Var4, z05.f35687j, b15Var8};
    }

    /* JADX INFO: renamed from: a */
    public static final void m3795a(ro2 ro2Var, x32 x32Var, long j, int i, int i2) {
        if (gq6.m6094s(j, -1L)) {
            return;
        }
        ro2Var.m10383a(x32Var.f33955b, (int) ((j >>> 48) & 65535));
        ro2Var.m10383a(x32Var.f33956c, (int) ((j >>> 32) & 65535));
        ro2Var.m10383a(x32Var.f33957d, i - ((int) ((j >>> 16) & 65535)));
        ro2Var.m10383a(x32Var.f33958e, i2 - ((int) (j & 65535)));
    }
}
