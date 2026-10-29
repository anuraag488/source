package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g03 {

    /* JADX INFO: renamed from: a */
    public k03 f19466a;

    /* JADX INFO: renamed from: b */
    public k03 f19467b;

    /* JADX INFO: renamed from: c */
    public wp1 f19468c;

    /* JADX INFO: renamed from: d */
    public zo0 f19469d;

    public g03() {
        g32 g32Var = new g32((byte) 10);
        g32Var.f19558b = this;
        VarHandle.storeStoreFence();
        this.f19468c = g32Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        return r1;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5870a(long j, long j2, ym0 ym0Var) {
        e03 e03Var;
        long j3;
        if (ym0Var instanceof e03) {
            e03Var = (e03) ym0Var;
            int i = e03Var.f17565v;
            if ((i & Integer.MIN_VALUE) != 0) {
                e03Var.f17565v = i - Integer.MIN_VALUE;
            } else {
                e03Var = new e03(this, ym0Var);
            }
        } else {
            e03Var = new e03(this, ym0Var);
        }
        e03 e03Var2 = e03Var;
        Object objMo4258R = e03Var2.f17563t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = e03Var2.f17565v;
        if (i2 == 0) {
            k43.m7376J(objMo4258R);
            k03 k03Var = this.f19466a;
            j3 = 0;
            if ((k03Var != null ? k03Var.m7353P0() : null) == null) {
                k03 k03Var2 = this.f19467b;
                if (k03Var2 != null) {
                    e03Var2.f17565v = 1;
                    objMo4258R = k03Var2.mo4258R(j, j2, e03Var2);
                }
            } else {
                k03 k03Var3 = this.f19466a;
                k03 k03VarM7353P0 = k03Var3 != null ? k03Var3.m7353P0() : null;
                if (k03VarM7353P0 != null) {
                    e03Var2.f17565v = 2;
                    objMo4258R = k03VarM7353P0.mo4258R(j, j2, e03Var2);
                }
            }
        } else if (i2 == 1) {
            k43.m7376J(objMo4258R);
            j3 = ((jx4) objMo4258R).f22730a;
        } else {
            if (i2 != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(objMo4258R);
            j3 = ((jx4) objMo4258R).f22730a;
        }
        return jx4.m7330a(j3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m5871b(long j, ym0 ym0Var) {
        f03 f03Var;
        long j2;
        if (ym0Var instanceof f03) {
            f03Var = (f03) ym0Var;
            int i = f03Var.f18639v;
            if ((i & Integer.MIN_VALUE) != 0) {
                f03Var.f18639v = i - Integer.MIN_VALUE;
            } else {
                f03Var = new f03(this, ym0Var);
            }
        } else {
            f03Var = new f03(this, ym0Var);
        }
        Object objMo4259Z = f03Var.f18637t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = f03Var.f18639v;
        if (i2 == 0) {
            k43.m7376J(objMo4259Z);
            k03 k03Var = this.f19466a;
            k03 k03VarM7353P0 = k03Var != null ? k03Var.m7353P0() : null;
            if (k03VarM7353P0 != null) {
                f03Var.f18639v = 1;
                objMo4259Z = k03VarM7353P0.mo4259Z(j, f03Var);
                if (objMo4259Z == ap0Var) {
                    return ap0Var;
                }
            } else {
                j2 = 0;
            }
            return jx4.m7330a(j2);
        }
        if (i2 != 1) {
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(objMo4259Z);
        j2 = ((jx4) objMo4259Z).f22730a;
        return jx4.m7330a(j2);
    }

    /* JADX INFO: renamed from: c */
    public final zo0 m5872c() {
        zo0 zo0Var = (zo0) this.f19468c.invoke();
        if (zo0Var != null) {
            return zo0Var;
        }
        C1077qn.m9989o("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
