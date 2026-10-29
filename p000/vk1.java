package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vk1 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f32697t;

    /* JADX INFO: renamed from: u */
    public boolean f32698u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ nv2 f32699v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ sw2 f32700w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk1(nv2 nv2Var, sw2 sw2Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f32697t = b;
        this.f32699v = nv2Var;
        this.f32700w = sw2Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        switch (this.f32697t) {
            case 0:
                return new vk1(this.f32699v, this.f32700w, wm0Var, (byte) 0);
            default:
                return new vk1(this.f32699v, this.f32700w, wm0Var, (byte) 1);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32697t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((vk1) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.f32697t;
        sw2 sw2Var = this.f32700w;
        nv2 nv2Var = this.f32699v;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f32698u;
                if (z) {
                    if (z) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                ArrayList arrayList = new ArrayList();
                y44 y44Var = nv2Var.f26111a;
                uk1 uk1Var = new uk1((byte) 0);
                uk1Var.f31947b = arrayList;
                uk1Var.f31948c = sw2Var;
                VarHandle.storeStoreFence();
                this.f32698u = true;
                y44Var.getClass();
                y44.m12879k(y44Var, uk1Var, this);
                return ap0Var;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f32698u;
                if (z2) {
                    if (z2) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                ArrayList arrayList2 = new ArrayList();
                y44 y44Var2 = nv2Var.f26111a;
                uk1 uk1Var2 = new uk1((byte) 1);
                uk1Var2.f31947b = arrayList2;
                uk1Var2.f31948c = sw2Var;
                VarHandle.storeStoreFence();
                this.f32698u = true;
                y44Var2.getClass();
                y44.m12879k(y44Var2, uk1Var2, this);
                return ap0Var2;
        }
    }
}
