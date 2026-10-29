package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l41 implements jc2 {

    /* JADX INFO: renamed from: a */
    public static final l41 f23778a = new l41();

    /* JADX INFO: renamed from: b */
    public static final xf3 f23779b = new xf3("kotlin.time.Duration", tf3.f31121r);

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        r50 r50Var = i41.f21117b;
        String strMo5377A = iv0Var.mo5377A();
        try {
            long jM3230I = as4.m3230I(strMo5377A);
            if (i41.m6646e(jM3230I, i41.f21120e)) {
                throw new IllegalStateException("invariant failed");
            }
            return i41.m6644c(jM3230I);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(zi4.m13621u("Invalid ISO duration string format: '", strMo5377A, "'."), e);
        }
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        long j = ((i41) obj).f21121a;
        r50 r50Var = i41.f21117b;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jM6657p = j < 0 ? i41.m6657p(j) : j;
        long jM6655n = i41.m6655n(jM6657p, m41.HOURS);
        boolean z = false;
        int iM6655n = i41.m6649h(jM6657p) ? 0 : (int) (i41.m6655n(jM6657p, m41.MINUTES) % 60);
        int iM6655n2 = i41.m6649h(jM6657p) ? 0 : (int) (i41.m6655n(jM6657p, m41.SECONDS) % 60);
        int iM6648g = i41.m6648g(jM6657p);
        if (i41.m6649h(j)) {
            jM6655n = 9999999999999L;
        }
        boolean z2 = jM6655n != 0;
        boolean z3 = (iM6655n2 == 0 && iM6648g == 0) ? false : true;
        if (iM6655n != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jM6655n);
            sb.append('H');
        }
        if (z) {
            sb.append(iM6655n);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            i41.m6643b(sb, iM6655n2, iM6648g, 9, "S", true);
        }
        g81Var.mo5916B(sb.toString());
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return f23779b;
    }
}
