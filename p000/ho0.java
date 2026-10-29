package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ho0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f20742t;

    /* JADX INFO: renamed from: u */
    public boolean f20743u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ pc3 f20744v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ yj4 f20745w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ho0(pc3 pc3Var, yj4 yj4Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f20742t = b;
        this.f20744v = pc3Var;
        this.f20745w = yj4Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        switch (this.f20742t) {
            case 0:
                return new ho0(this.f20744v, this.f20745w, wm0Var, (byte) 0);
            case 1:
                return new ho0(this.f20744v, this.f20745w, wm0Var, (byte) 1);
            default:
                return new ho0(this.f20744v, this.f20745w, wm0Var, (byte) 2);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20742t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((ho0) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f20742t;
        pc3 pc3Var = this.f20744v;
        yj4 yj4Var = this.f20745w;
        ju4 ju4Var = ju4.f22634a;
        wm0 wm0Var = null;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f20743u;
                if (z) {
                    if (z) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                this.f20743u = true;
                Object objM13685q = zp0.m13685q(new C0858l3((Object) pc3Var, (Object) yj4Var, wm0Var, (byte) 2), this);
                if (objM13685q != ap0Var) {
                    objM13685q = ju4Var;
                }
                return objM13685q == ap0Var ? ap0Var : ju4Var;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f20743u;
                if (z2) {
                    if (z2) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                this.f20743u = true;
                Object objM6084i = gq6.m6084i(pc3Var, new bn1(yj4Var, null), this);
                if (objM6084i != ap0Var2) {
                    objM6084i = ju4Var;
                }
                return objM6084i == ap0Var2 ? ap0Var2 : ju4Var;
            default:
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f20743u;
                if (z3) {
                    if (z3) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                this.f20743u = true;
                jo2 jo2Var = new jo2((byte) 0);
                jo2Var.f22470b = yj4Var;
                VarHandle.storeStoreFence();
                ko2 ko2Var = new ko2((byte) 0);
                ko2Var.f23287b = yj4Var;
                VarHandle.storeStoreFence();
                ko2 ko2Var2 = new ko2((byte) 1);
                ko2Var2.f23287b = yj4Var;
                VarHandle.storeStoreFence();
                C1017p0 c1017p0 = new C1017p0((byte) 23);
                c1017p0.f27254b = yj4Var;
                VarHandle.storeStoreFence();
                Object objM9709d = q21.m9709d(this.f20744v, jo2Var, ko2Var, ko2Var2, c1017p0, this);
                if (objM9709d != ap0Var3) {
                    objM9709d = ju4Var;
                }
                return objM9709d == ap0Var3 ? ap0Var3 : ju4Var;
        }
    }
}
