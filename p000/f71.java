package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class f71 {

    /* JADX INFO: renamed from: a */
    public static final rq4 f18798a;

    /* JADX INFO: renamed from: b */
    public static final rq4 f18799b;

    /* JADX INFO: renamed from: c */
    public static final rq4 f18800c;

    static {
        bs0 bs0Var = new bs0(0.4f, 0.0f, 0.6f, 1.0f);
        f18798a = new rq4(120, 0, h51.f20396a);
        f18799b = new rq4(150, 0, bs0Var);
        f18800c = new rq4(120, 0, bs0Var);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044 A[PHI: r12
  0x0044: PHI (r12v3 rq4) = (r12v2 rq4), (r12v2 rq4), (r12v2 rq4), (r12v4 rq4), (r12v4 rq4), (r12v4 rq4), (r12v4 rq4) binds: [B:35:0x005b, B:38:0x0060, B:44:0x006c, B:22:0x0042, B:25:0x0048, B:28:0x004d, B:31:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public static final Object m5611a(C0910mi c0910mi, float f, c62 c62Var, c62 c62Var2, ym0 ym0Var) {
        e71 e71Var;
        rq4 rq4Var;
        if (ym0Var instanceof e71) {
            e71Var = (e71) ym0Var;
            int i = e71Var.f17863u;
            if ((i & Integer.MIN_VALUE) != 0) {
                e71Var.f17863u = i - Integer.MIN_VALUE;
            } else {
                e71Var = new e71(ym0Var);
            }
        } else {
            e71Var = new e71(ym0Var);
        }
        e71 e71Var2 = e71Var;
        Object obj = e71Var2.f17862t;
        Object obj2 = ap0.f14763a;
        int i2 = e71Var2.f17863u;
        ju4 ju4Var = ju4.f22634a;
        rq4 rq4Var2 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                k43.m7376J(obj);
                return ju4Var;
            }
            if (i2 == 2) {
                k43.m7376J(obj);
                return ju4Var;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(obj);
        if (c62Var2 != null) {
            boolean z = c62Var2 instanceof ff3;
            rq4Var = f18798a;
            if (z || (c62Var2 instanceof x21) || (c62Var2 instanceof mx1) || (c62Var2 instanceof rk1)) {
                rq4Var2 = rq4Var;
            }
        } else if (c62Var != null) {
            boolean z2 = c62Var instanceof ff3;
            rq4Var = f18799b;
            if (z2 || (c62Var instanceof x21)) {
                rq4Var2 = rq4Var;
            } else if (c62Var instanceof mx1) {
                rq4Var2 = f18800c;
            } else if (c62Var instanceof rk1) {
                rq4Var2 = rq4Var;
            }
        }
        if (rq4Var2 != null) {
            p11 p11VarM9350a = p11.m9350a(f);
            e71Var2.f17863u = 1;
            if (C0910mi.m8325a(c0910mi, p11VarM9350a, rq4Var2, null, e71Var2, 12) == obj2) {
                return obj2;
            }
            return ju4Var;
        }
        Object objM9350a = p11.m9350a(f);
        e71Var2.f17863u = 2;
        if (c0910mi.m8330f(e71Var2, objM9350a) == obj2) {
            return obj2;
        }
        return ju4Var;
    }
}
