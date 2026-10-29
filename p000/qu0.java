package p000;

import ads_mobile_sdk.m81;
import ads_mobile_sdk.q81;
import java.lang.invoke.VarHandle;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qu0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f28801t = 1;

    /* JADX INFO: renamed from: u */
    public boolean f28802u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ boolean f28803v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f28804w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f28805x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f28806y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f28807z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu0(q81 q81Var, String str, String str2, Map map, boolean z, wm0 wm0Var) {
        super(2, wm0Var);
        this.f28804w = q81Var;
        this.f28805x = str;
        this.f28806y = str2;
        this.f28807z = map;
        this.f28803v = z;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f28801t;
        Object obj2 = this.f28807z;
        Object obj3 = this.f28806y;
        switch (b) {
            case 0:
                qu0 qu0Var = new qu0((ru0) obj3, (ol3) obj2, this.f28805x, this.f28803v, wm0Var);
                qu0Var.f28804w = obj;
                return qu0Var;
            default:
                return new qu0((q81) this.f28804w, (String) this.f28805x, (String) obj3, (Map) obj2, this.f28803v, wm0Var);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28801t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((qu0) create((wm0) obj2, (sf1) obj)).invokeSuspend(ju4Var);
            default:
                return ((qu0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        switch (this.f28801t) {
            case 0:
                sf1 sf1Var = (sf1) this.f28804w;
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f28802u;
                if (!z) {
                    k43.m7376J(obj);
                    ru0 ru0Var = (ru0) this.f28806y;
                    ru0Var.getClass();
                    pu0 pu0Var = new pu0((ol3) this.f28807z, ru0Var, sf1Var, this.f28805x, this.f28803v, null);
                    this.f28804w = null;
                    this.f28802u = true;
                    if (lb5.m7917Z("DataStore.writeData", null, pu0Var, this) == ap0Var) {
                        return ap0Var;
                    }
                } else {
                    if (!z) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f28802u;
                if (!z2) {
                    k43.m7376J(obj);
                    q81 q81Var = (q81) this.f28804w;
                    String str = (String) this.f28805x;
                    String str2 = (String) this.f28806y;
                    Map map = (Map) this.f28807z;
                    boolean z3 = this.f28803v;
                    this.f28802u = true;
                    b70 b70Var = new b70(1, C0006a5.m86x(this));
                    b70Var.m3497u();
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    m81 m81Var = new m81();
                    m81Var.f7178a = b70Var;
                    m81Var.f7179b = atomicBoolean;
                    VarHandle.storeStoreFence();
                    synchronized (((xx1) q81Var.f8894c.getValue())) {
                        ((gs5) ((xx1) q81Var.f8894c.getValue())).m6163h(str, str2, m81Var, map, z3);
                    }
                    if (b70Var.m3495r() == ap0Var2) {
                        return ap0Var2;
                    }
                } else {
                    if (!z2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu0(ru0 ru0Var, ol3 ol3Var, Object obj, boolean z, wm0 wm0Var) {
        super(2, wm0Var);
        this.f28806y = ru0Var;
        this.f28807z = ol3Var;
        this.f28805x = obj;
        this.f28803v = z;
    }
}
