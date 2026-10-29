package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fh2 {

    /* JADX INFO: renamed from: a */
    public zo0 f18982a;

    /* JADX INFO: renamed from: b */
    public au1 f18983b;

    /* JADX INFO: renamed from: c */
    public g32 f18984c;

    /* JADX INFO: renamed from: d */
    public ag1 f18985d;

    /* JADX INFO: renamed from: e */
    public ag1 f18986e;

    /* JADX INFO: renamed from: f */
    public ag1 f18987f;

    /* JADX INFO: renamed from: g */
    public boolean f18988g;

    /* JADX INFO: renamed from: h */
    public d83 f18989h;

    /* JADX INFO: renamed from: i */
    public d83 f18990i;

    /* JADX INFO: renamed from: j */
    public d83 f18991j;

    /* JADX INFO: renamed from: k */
    public d83 f18992k;

    /* JADX INFO: renamed from: l */
    public long f18993l;

    /* JADX INFO: renamed from: m */
    public long f18994m;

    /* JADX INFO: renamed from: n */
    public long f18995n;

    /* JADX INFO: renamed from: o */
    public bu1 f18996o;

    /* JADX INFO: renamed from: p */
    public C0910mi f18997p;

    /* JADX INFO: renamed from: q */
    public C0910mi f18998q;

    /* JADX INFO: renamed from: r */
    public d83 f18999r;

    /* JADX INFO: renamed from: a */
    public final void m5710a() {
        zo0 zo0Var = this.f18982a;
        bu1 bu1Var = this.f18996o;
        ag1 ag1Var = this.f18985d;
        d83 d83Var = this.f18990i;
        wm0 wm0Var = null;
        if (((Boolean) d83Var.getValue()).booleanValue() || ag1Var == null || bu1Var == null) {
            if (m5711b()) {
                if (bu1Var != null) {
                    bu1Var.m3689f(1.0f);
                }
                lb5.m7910S(zo0Var, null, null, new dh2(this, wm0Var, (byte) 0), 3);
                return;
            }
            return;
        }
        d83Var.setValue(Boolean.TRUE);
        boolean zM5711b = m5711b();
        boolean z = !zM5711b;
        if (!zM5711b) {
            bu1Var.m3689f(0.0f);
        }
        lb5.m7910S(zo0Var, null, null, new fu0(z, this, ag1Var, bu1Var, null), 3);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5711b() {
        return ((Boolean) this.f18991j.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m5712c() {
        au1 au1Var;
        d83 d83Var = this.f18990i;
        zo0 zo0Var = this.f18982a;
        d83 d83Var2 = this.f18989h;
        byte b = 3;
        wm0 wm0Var = null;
        if (((Boolean) d83Var2.getValue()).booleanValue()) {
            d83Var2.setValue(Boolean.FALSE);
            lb5.m7910S(zo0Var, null, null, new dh2(this, wm0Var, (byte) 2), 3);
        }
        if (((Boolean) d83Var.getValue()).booleanValue()) {
            d83Var.setValue(Boolean.FALSE);
            lb5.m7910S(zo0Var, null, null, new dh2(this, wm0Var, b), 3);
        }
        if (m5711b()) {
            this.f18991j.setValue(Boolean.FALSE);
            lb5.m7910S(zo0Var, null, null, new dh2(this, wm0Var, (byte) 4), 3);
        }
        this.f18988g = false;
        this.f18999r.setValue(o52.m8954a(0L));
        this.f18993l = 9223372034707292159L;
        bu1 bu1Var = this.f18996o;
        if (bu1Var != null && (au1Var = this.f18983b) != null) {
            au1Var.mo3311a(bu1Var);
        }
        this.f18996o = null;
        this.f18985d = null;
        this.f18987f = null;
        this.f18986e = null;
    }
}
