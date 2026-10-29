package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w93 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f33178t;

    /* JADX INFO: renamed from: u */
    public boolean f33179u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f33180v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ mq1 f33181w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w93(mq1 mq1Var, Object obj, wm0 wm0Var) {
        super(2, wm0Var);
        this.f33178t = (byte) 3;
        this.f33181w = mq1Var;
        this.f33180v = obj;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        switch (this.f33178t) {
            case 0:
                w93 w93Var = new w93(this.f33181w, wm0Var, (byte) 0);
                w93Var.f33180v = obj;
                return w93Var;
            case 1:
                w93 w93Var2 = new w93(this.f33181w, wm0Var, (byte) 1);
                w93Var2.f33180v = obj;
                return w93Var2;
            case 2:
                w93 w93Var3 = new w93(this.f33181w, wm0Var, (byte) 2);
                w93Var3.f33180v = obj;
                return w93Var3;
            default:
                return new w93(this.f33181w, this.f33180v, wm0Var);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f33178t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((w93) create((wm0) obj2, (List) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((w93) create((wm0) obj2, (hw2) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((w93) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return ((w93) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f33178t;
        mq1 mq1Var = this.f33181w;
        boolean z = true;
        switch (b) {
            case 0:
                List list = (List) this.f33180v;
                ap0 ap0Var = ap0.f14763a;
                boolean z2 = this.f33179u;
                if (!z2) {
                    k43.m7376J(obj);
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        do {
                            if (it.hasNext()) {
                            }
                        } while (z62.m13387o(((u93) it.next()).mo11770a(), Boolean.TRUE));
                        this.f33180v = null;
                        this.f33179u = true;
                        obj = mq1Var.invoke(list, this);
                        if (obj == ap0Var) {
                            return ap0Var;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                if (!z2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                if (!((Boolean) obj).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                hw2 hw2Var = (hw2) this.f33180v;
                ap0 ap0Var2 = ap0.f14763a;
                boolean z3 = this.f33179u;
                if (!z3) {
                    k43.m7376J(obj);
                    this.f33180v = null;
                    this.f33179u = true;
                    obj = mq1Var.invoke(hw2Var, this);
                    if (obj == ap0Var2) {
                        return ap0Var2;
                    }
                } else {
                    if (!z3) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                hw2 hw2Var2 = (hw2) obj;
                hw2Var2.f20902b.f33577a.set(true);
                return hw2Var2;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                boolean z4 = this.f33179u;
                if (!z4) {
                    k43.m7376J(obj);
                    zo0 zo0Var = (zo0) this.f33180v;
                    this.f33179u = true;
                    if (mq1Var.invoke(zo0Var, this) == ap0Var3) {
                        return ap0Var3;
                    }
                } else {
                    if (!z4) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            default:
                ap0 ap0Var4 = ap0.f14763a;
                boolean z5 = this.f33179u;
                if (z5) {
                    if (z5) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                Object obj2 = this.f33180v;
                this.f33179u = true;
                Object objInvoke = mq1Var.invoke(obj2, this);
                return objInvoke == ap0Var4 ? ap0Var4 : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w93(mq1 mq1Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f33178t = b;
        this.f33181w = mq1Var;
    }
}
