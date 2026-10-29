package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fy3 implements d03 {

    /* JADX INFO: renamed from: a */
    public vy3 f19422a;

    /* JADX INFO: renamed from: b */
    public boolean f19423b;

    @Override // p000.d03
    /* JADX INFO: renamed from: Q */
    public final long mo4257Q(long j, int i, long j2) {
        if (!this.f19423b) {
            return 0L;
        }
        vy3 vy3Var = this.f19422a;
        if (vy3Var.f32958a.mo6019b()) {
            return 0L;
        }
        return vy3Var.m12036i(vy3Var.m12032e(vy3Var.f32958a.mo6022e(vy3Var.m12032e(vy3Var.m12035h(j2)))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.d03
    /* JADX INFO: renamed from: R */
    public final Object mo4258R(long j, long j2, wm0 wm0Var) throws Throwable {
        ey3 ey3Var;
        long jM7334e;
        if (wm0Var instanceof ey3) {
            ey3Var = (ey3) wm0Var;
            int i = ey3Var.f18584w;
            if ((i & Integer.MIN_VALUE) != 0) {
                ey3Var.f18584w = i - Integer.MIN_VALUE;
            } else {
                ey3Var = new ey3(this, (ym0) wm0Var);
            }
        } else {
            ey3Var = new ey3(this, (ym0) wm0Var);
        }
        Object objM12028a = ey3Var.f18582u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = ey3Var.f18584w;
        if (i2 == 0) {
            k43.m7376J(objM12028a);
            jM7334e = 0;
            if (this.f19423b) {
                vy3 vy3Var = this.f19422a;
                if (!vy3Var.f32966i) {
                    ey3Var.f18581t = j2;
                    ey3Var.f18584w = 1;
                    objM12028a = vy3Var.m12028a(j2, ey3Var);
                    if (objM12028a == ap0Var) {
                        return ap0Var;
                    }
                }
                jM7334e = jx4.m7334e(j2, jM7334e);
            }
            return jx4.m7330a(jM7334e);
        }
        if (i2 != 1) {
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = ey3Var.f18581t;
        k43.m7376J(objM12028a);
        jM7334e = ((jx4) objM12028a).f22730a;
        jM7334e = jx4.m7334e(j2, jM7334e);
        return jx4.m7330a(jM7334e);
    }
}
