package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s40 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f29862t;

    /* JADX INFO: renamed from: u */
    public boolean f29863u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ nv2 f29864v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ w94 f29865w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s40(nv2 nv2Var, w94 w94Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f29862t = b;
        this.f29864v = nv2Var;
        this.f29865w = w94Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        switch (this.f29862t) {
            case 0:
                return new s40(this.f29864v, this.f29865w, wm0Var, (byte) 0);
            default:
                return new s40(this.f29864v, this.f29865w, wm0Var, (byte) 1);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29862t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((s40) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.f29862t;
        w94 w94Var = this.f29865w;
        nv2 nv2Var = this.f29864v;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f29863u;
                if (z) {
                    if (z) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                y44 y44Var = nv2Var.f26111a;
                C0837kj c0837kj = new C0837kj((byte) 1);
                c0837kj.f23160b = w94Var;
                VarHandle.storeStoreFence();
                this.f29863u = true;
                y44Var.getClass();
                y44.m12879k(y44Var, c0837kj, this);
                return ap0Var;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f29863u;
                if (z2) {
                    if (z2) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                y44 y44Var2 = nv2Var.f26111a;
                C0837kj c0837kj2 = new C0837kj((byte) 2);
                c0837kj2.f23160b = w94Var;
                VarHandle.storeStoreFence();
                this.f29863u = true;
                y44Var2.getClass();
                y44.m12879k(y44Var2, c0837kj2, this);
                return ap0Var2;
        }
    }
}
