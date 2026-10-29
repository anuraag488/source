package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ca2 {

    /* JADX INFO: renamed from: a */
    public static final m32 f15904a = AbstractC1356y5.m12908b("kotlinx.serialization.json.JsonUnquotedLiteral", fd4.f18924a);

    /* JADX INFO: renamed from: a */
    public static final fb2 m3928a(Number number) {
        return new na2(number, false, null);
    }

    /* JADX INFO: renamed from: b */
    public static final fb2 m3929b(String str) {
        return str == null ? ra2.INSTANCE : new na2(str, true, null);
    }

    /* JADX INFO: renamed from: c */
    public static final fb2 m3930c(aa2 aa2Var) {
        fb2 fb2Var = aa2Var instanceof fb2 ? (fb2) aa2Var : null;
        if (fb2Var != null) {
            return fb2Var;
        }
        throw new IllegalArgumentException("Element " + rl3.m10361a(aa2Var.getClass()) + " is not a JsonPrimitive");
    }

    /* JADX INFO: renamed from: d */
    public static final long m3931d(fb2 fb2Var) {
        dd4 dd4VarM13883r = zy5.m13883r(i92.f21187c, fb2Var.mo5629a());
        String str = dd4VarM13883r.f16996g;
        long jM7801k = dd4VarM13883r.m7801k();
        if (dd4VarM13883r.mo4482h() == 10) {
            return jM7801k;
        }
        int i = dd4VarM13883r.f23686b;
        int i2 = i > 0 ? i - 1 : i;
        AbstractC0856l1.m7793r(dd4VarM13883r, zi4.m13621u("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, 4);
        throw null;
    }
}
