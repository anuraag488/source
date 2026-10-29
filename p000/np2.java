package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class np2 implements dd3 {

    /* JADX INFO: renamed from: a */
    public ar3 f26014a;

    /* JADX INFO: renamed from: b */
    public w52 f26015b;

    /* JADX INFO: renamed from: c */
    public df2 f26016c;

    /* JADX INFO: renamed from: d */
    public w52 f26017d;

    /* JADX INFO: renamed from: e */
    public o52 f26018e;

    @Override // p000.dd3
    /* JADX INFO: renamed from: c */
    public final long mo3100c(s52 s52Var, long j, df2 df2Var, long j2) {
        o52 o52Var = this.f26018e;
        if (o52Var != null) {
            w52 w52Var = this.f26015b;
            if ((w52Var == null ? false : w52.m12108c(w52Var.f33109a, j)) && this.f26016c == df2Var) {
                w52 w52Var2 = this.f26017d;
                if (w52Var2 != null ? w52.m12108c(w52Var2.f33109a, j2) : false) {
                    return o52Var.f26352a;
                }
            }
        }
        long jMo3100c = this.f26014a.mo3100c(s52Var, j, df2Var, j2);
        this.f26015b = w52.m12106a(j);
        this.f26016c = df2Var;
        this.f26017d = w52.m12106a(j2);
        this.f26018e = o52.m8954a(jMo3100c);
        return jMo3100c;
    }
}
