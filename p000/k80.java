package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k80 implements ti1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22975a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22976b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f22977c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f22978d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f22979e;

    public /* synthetic */ k80(byte b) {
        this.f22975a = b;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    @Override // p000.ti1
    public final Object emit(Object obj, wm0 wm0Var) {
        j80 j80Var;
        byte b = this.f22975a;
        boolean z = true;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ql3 ql3Var = (ql3) this.f22976b;
                if (wm0Var instanceof j80) {
                    j80Var = (j80) wm0Var;
                    int i = j80Var.f22085x;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        j80Var.f22085x = i - Integer.MIN_VALUE;
                    } else {
                        j80Var = new j80(this, wm0Var);
                    }
                } else {
                    j80Var = new j80(this, wm0Var);
                }
                Object obj2 = j80Var.f22083v;
                ap0 ap0Var = ap0.f14763a;
                int i2 = j80Var.f22085x;
                if (i2 == 0) {
                    k43.m7376J(obj2);
                    t82 t82Var = (t82) ql3Var.f28555a;
                    if (t82Var != null) {
                        t82Var.mo4993a(new c90("Child of the scoped flow was cancelled"));
                        j80Var.f22081t = obj;
                        j80Var.f22082u = t82Var;
                        j80Var.f22085x = 1;
                        if (t82Var.mo5005t(j80Var) == ap0Var) {
                            return ap0Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t82 t82Var2 = j80Var.f22082u;
                    obj = j80Var.f22081t;
                    k43.m7376J(obj2);
                }
                ql3Var.f28555a = lb5.m7910S((zo0) this.f22977c, null, cp0.f16328d, new i80((l80) this.f22978d, (ti1) this.f22979e, obj, null), 1);
                return ju4Var;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                pk4 pk4Var = (pk4) this.f22978d;
                uj2 uj2Var = (uj2) this.f22976b;
                if (zBooleanValue && uj2Var.m11575b()) {
                    oh6.m9078C((bl4) this.f22977c, uj2Var, pk4Var.m9550l(), (l12) this.f22979e, pk4Var.f27694b);
                } else {
                    oh6.m9112r(uj2Var);
                }
                return ju4Var;
            default:
                c62 c62Var = (c62) obj;
                ol3 ol3Var = (ol3) this.f22978d;
                ol3 ol3Var2 = (ol3) this.f22977c;
                ol3 ol3Var3 = (ol3) this.f22976b;
                if (c62Var instanceof ff3) {
                    ol3Var3.f26851a++;
                } else if ((c62Var instanceof gf3) || (c62Var instanceof ef3)) {
                    ol3Var3.f26851a--;
                } else if (c62Var instanceof mx1) {
                    ol3Var2.f26851a++;
                } else if (c62Var instanceof nx1) {
                    ol3Var2.f26851a--;
                } else if (c62Var instanceof rk1) {
                    ol3Var.f26851a++;
                } else if (c62Var instanceof sk1) {
                    ol3Var.f26851a--;
                }
                int i3 = ol3Var3.f26851a;
                boolean z2 = false;
                boolean z3 = i3 > 0;
                boolean z4 = ol3Var2.f26851a > 0;
                boolean z5 = ol3Var.f26851a > 0;
                sv0 sv0Var = (sv0) this.f22979e;
                if (sv0Var.f30577p != z3) {
                    sv0Var.f30577p = z3;
                    z2 = true;
                }
                if (sv0Var.f30578q != z4) {
                    sv0Var.f30578q = z4;
                    z2 = true;
                }
                if (sv0Var.f30579r != z5) {
                    sv0Var.f30579r = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    z62.m13348G(sv0Var);
                }
                return ju4Var;
        }
    }
}
