package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class su0 {

    /* JADX INFO: renamed from: a */
    public ac4 f30564a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public void m10916a(fq4 fq4Var, ym0 ym0Var) {
        x23 x23Var;
        if (ym0Var instanceof x23) {
            x23Var = (x23) ym0Var;
            int i = x23Var.f33945v;
            if ((i & Integer.MIN_VALUE) != 0) {
                x23Var.f33945v = i - Integer.MIN_VALUE;
            } else {
                x23Var = new x23(this, ym0Var);
            }
        } else {
            x23Var = new x23(this, ym0Var);
        }
        Object obj = x23Var.f33943t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = x23Var.f33945v;
        if (i2 == 0) {
            k43.m7376J(obj);
            ac4 ac4Var = this.f30564a;
            x23Var.f33945v = 1;
            ac4Var.collect(fq4Var, x23Var);
            return;
        }
        if (i2 != 1) {
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
        } else {
            k43.m7376J(obj);
            xy4.m12794w();
        }
    }

    /* JADX INFO: renamed from: b */
    public wb4 m10917b() {
        return (wb4) this.f30564a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    /* JADX INFO: renamed from: c */
    public wb4 m10918c(wb4 wb4Var) {
        Object value;
        wb4 wb4Var2;
        ac4 ac4Var = this.f30564a;
        do {
            value = ac4Var.getValue();
            wb4Var2 = (wb4) value;
            if ((wb4Var2 instanceof tj3) || z62.m13387o(wb4Var2, wt4.f33723b)) {
                wb4Var2 = wb4Var;
            } else if (wb4Var2 instanceof at0) {
                if (wb4Var.f33220a > ((at0) wb4Var2).f33220a) {
                    wb4Var2 = wb4Var;
                }
            } else if (!(wb4Var2 instanceof yf1)) {
                if (wb4Var2 instanceof x03) {
                    C1077qn.m9989o("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    return null;
                }
                C0670g.m5864c();
                return null;
            }
        } while (!ac4Var.m198i(value, wb4Var2));
        return wb4Var2;
    }
}
