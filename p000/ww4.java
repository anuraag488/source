package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ww4 extends i73 {

    /* JADX INFO: renamed from: f */
    public d83 f33802f;

    /* JADX INFO: renamed from: g */
    public d83 f33803g;

    /* JADX INFO: renamed from: h */
    public rw4 f33804h;

    /* JADX INFO: renamed from: i */
    public d83 f33805i;

    /* JADX INFO: renamed from: j */
    public float f33806j;

    /* JADX INFO: renamed from: k */
    public o00 f33807k;

    @Override // p000.i73
    /* JADX INFO: renamed from: a */
    public final boolean mo35a(float f) {
        this.f33806j = f;
        return true;
    }

    @Override // p000.i73
    /* JADX INFO: renamed from: b */
    public final boolean mo36b(o00 o00Var) {
        this.f33807k = o00Var;
        return true;
    }

    @Override // p000.i73
    /* JADX INFO: renamed from: g */
    public final long mo40g() {
        return ((h74) this.f33802f.getValue()).f20418a;
    }

    @Override // p000.i73
    /* JADX INFO: renamed from: i */
    public final void mo42i(u31 u31Var) {
        rw4 rw4Var = this.f33804h;
        o00 o00Var = this.f33807k;
        if (o00Var == null) {
            o00Var = (o00) rw4Var.f29694g.getValue();
        }
        if (((Boolean) this.f33803g.getValue()).booleanValue() && u31Var.getLayoutDirection() == df2.f17012b) {
            long jMo11226a0 = u31Var.mo11226a0();
            jp0 jp0VarMo7035J = u31Var.mo7035J();
            long jM7219E = jp0VarMo7035J.m7219E();
            jp0VarMo7035J.m7248w().mo6253j();
            try {
                ((ar3) jp0VarMo7035J.f22481b).m3155y(-1.0f, 1.0f, jMo11226a0);
                rw4Var.m10478e(u31Var, this.f33806j, o00Var);
                d55.m4374s(jp0VarMo7035J, jM7219E);
            } catch (Throwable th) {
                d55.m4374s(jp0VarMo7035J, jM7219E);
                throw th;
            }
        } else {
            rw4Var.m10478e(u31Var, this.f33806j, o00Var);
        }
        this.f33805i.getValue();
    }
}
