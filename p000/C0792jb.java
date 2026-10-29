package p000;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: jb */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0792jb extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f22143t;

    /* JADX INFO: renamed from: u */
    public boolean f22144u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f22145v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f22146w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0792jb(Object obj, Object obj2, wm0 wm0Var, byte b) {
        super(1, wm0Var);
        this.f22143t = b;
        this.f22145v = obj;
        this.f22146w = obj2;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f22143t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f22146w;
        Object obj3 = this.f22145v;
        wm0 wm0Var = (wm0) obj;
        switch (b) {
            case 0:
                return new C0792jb((C0940nb) obj3, (nq1) obj2, wm0Var, (byte) 0).invokeSuspend(ju4Var);
            case 1:
                return new C0792jb((C0651fh) obj3, (ej4) obj2, wm0Var, (byte) 1).invokeSuspend(ju4Var);
            case 2:
                return new C0792jb((ag0) obj3, (xz4) obj2, wm0Var, (byte) 2).invokeSuspend(ju4Var);
            case 3:
                return new C0792jb((mq1) obj3, (g44) obj2, wm0Var, (byte) 3).invokeSuspend(ju4Var);
            case 4:
                return new C0792jb((C1375yo) obj3, (vt1) obj2, wm0Var, (byte) 4).invokeSuspend(ju4Var);
            case 5:
                return new C0792jb((C0705gy) obj3, (C0668fy) obj2, wm0Var, (byte) 5).invokeSuspend(ju4Var);
            case 6:
                return new C0792jb((pn0) obj3, (Set) obj2, wm0Var, (byte) 6).invokeSuspend(ju4Var);
            case 7:
                return new C0792jb((mq1) obj3, (at0) obj2, wm0Var, (byte) 7).invokeSuspend(ju4Var);
            case 8:
                return new C0792jb((hn4) obj3, (oh4) obj2, wm0Var, (byte) 8).invokeSuspend(ju4Var);
            default:
                return new C0792jb((z93) obj3, (C1367yg) obj2, wm0Var, (byte) 9).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        Runnable runnable;
        C0527ch c0527ch;
        Runnable runnable2;
        byte b = this.f22143t;
        byte b2 = 0;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f22146w;
        Object obj3 = this.f22145v;
        byte b3 = 1;
        wm0 wm0Var = null;
        switch (b) {
            case 0:
                C0940nb c0940nb = (C0940nb) obj3;
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f22144u;
                if (!z) {
                    k43.m7376J(obj);
                    C0756ib c0756ib = new C0756ib(b3);
                    c0756ib.f21241b = c0940nb;
                    VarHandle.storeStoreFence();
                    C0671g0 c0671g0 = new C0671g0(obj2, (Object) c0940nb, wm0Var, (byte) 3);
                    this.f22144u = true;
                    if (AbstractC0485bb.m3537d(c0756ib, c0671g0, this) == ap0Var) {
                        return ap0Var;
                    }
                } else {
                    if (!z) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                uv0 uv0VarM8670h = c0940nb.m8670h();
                z73 z73Var = (z73) c0940nb.f25612i;
                Object objM11651a = uv0VarM8670h.m11651a(z73Var.m13399h());
                if (objM11651a == null) {
                    return ju4Var;
                }
                if (Math.abs(z73Var.m13399h() - c0940nb.m8670h().m11656f(objM11651a)) >= 0.5f || !((Boolean) ((yp1) c0940nb.f25605b).invoke(objM11651a)).booleanValue()) {
                    return ju4Var;
                }
                ((d83) c0940nb.f25608e).setValue(objM11651a);
                ((d83) c0940nb.f25607d).setValue(objM11651a);
                return ju4Var;
            case 1:
                C0651fh c0651fh = (C0651fh) obj3;
                aa4 aa4Var = c0651fh.f18975e;
                View view = c0651fh.f18971a;
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f22144u;
                byte b4 = 4;
                try {
                    if (!z2) {
                        k43.m7376J(obj);
                        C0575dh c0575dh = new C0575dh();
                        f40 f40VarM5333H = ev0.m5333H(0, null, null, 7);
                        c0575dh.f17044a = f40VarM5333H;
                        VarHandle.storeStoreFence();
                        ej4 ej4Var = (ej4) obj2;
                        C0454ah c0454ah = new C0454ah((byte) 0);
                        c0454ah.f14503b = c0651fh;
                        c0454ah.f14504c = ej4Var;
                        VarHandle.storeStoreFence();
                        C0454ah c0454ah2 = new C0454ah((byte) 1);
                        c0454ah2.f14503b = c0651fh;
                        c0454ah2.f14504c = ej4Var;
                        VarHandle.storeStoreFence();
                        C0527ch c0527ch2 = new C0527ch();
                        c0527ch2.f16009a = c0575dh;
                        c0527ch2.f16010b = c0454ah;
                        c0527ch2.f16011c = c0454ah2;
                        c0527ch2.f16012d = view;
                        VarHandle.storeStoreFence();
                        yp1 yp1Var = c0651fh.f18972b;
                        if (yp1Var != null && (c0527ch = (C0527ch) yp1Var.invoke(c0527ch2)) != null) {
                            c0527ch2 = c0527ch;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler = view.getHandler();
                        if (looperMyLooper != (handler != null ? handler.getLooper() : null)) {
                            RunnableC0612eh runnableC0612eh = c0651fh.f18979i;
                            if (runnableC0612eh == null) {
                                runnableC0612eh = new RunnableC0612eh(b2);
                                runnableC0612eh.f18081b = c0651fh;
                                runnableC0612eh.f18082c = c0527ch2;
                                runnableC0612eh.f18083d = c0575dh;
                                VarHandle.storeStoreFence();
                                c0651fh.f18979i = runnableC0612eh;
                            }
                            view.post(runnableC0612eh);
                        } else {
                            oi1 oi1Var = new oi1();
                            oi1Var.f26761a = c0527ch2;
                            VarHandle.storeStoreFence();
                            ActionMode actionModeStartActionMode = view.startActionMode(oi1Var, 1);
                            if (actionModeStartActionMode == null) {
                                return ju4Var;
                            }
                            c0651fh.f18978h = actionModeStartActionMode;
                        }
                        this.f22144u = true;
                        Object objMo3509d = f40VarM5333H.mo3509d(this);
                        if (objMo3509d != ap0Var2) {
                            objMo3509d = ju4Var;
                        }
                        if (objMo3509d == ap0Var2) {
                            return ap0Var2;
                        }
                    } else {
                        if (!z2) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                    }
                    aa4Var.m155a();
                    Looper looperMyLooper2 = Looper.myLooper();
                    Handler handler2 = view.getHandler();
                    if (looperMyLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                        Runnable runnable3 = c0651fh.f18980j;
                        if (runnable3 == null) {
                            runnable2 = runnable3;
                            RunnableC1054q0 runnableC1054q0 = new RunnableC1054q0(b4);
                            runnableC1054q0.f28115b = c0651fh;
                            VarHandle.storeStoreFence();
                            c0651fh.f18980j = runnableC1054q0;
                            runnable2 = runnableC1054q0;
                        }
                        runnable2 = runnable3;
                        view.post(runnable2);
                    } else {
                        ActionMode actionMode = c0651fh.f18978h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    RunnableC0612eh runnableC0612eh2 = c0651fh.f18979i;
                    if (runnableC0612eh2 != null) {
                        view.removeCallbacks(runnableC0612eh2);
                    }
                    c0651fh.f18978h = null;
                    return ju4Var;
                } catch (Throwable th) {
                    aa4Var.m155a();
                    Looper looperMyLooper3 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                        Runnable runnable4 = c0651fh.f18980j;
                        if (runnable4 == null) {
                            runnable = runnable4;
                            RunnableC1054q0 runnableC1054q1 = new RunnableC1054q0(b4);
                            runnableC1054q1.f28115b = c0651fh;
                            VarHandle.storeStoreFence();
                            c0651fh.f18980j = runnableC1054q1;
                            runnable = runnableC1054q1;
                        }
                        runnable = runnable4;
                        view.post(runnable);
                    } else {
                        ActionMode actionMode2 = c0651fh.f18978h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    RunnableC0612eh runnableC0612eh3 = c0651fh.f18979i;
                    if (runnableC0612eh3 != null) {
                        view.removeCallbacks(runnableC0612eh3);
                    }
                    c0651fh.f18978h = null;
                    throw th;
                }
            case 2:
                ag0 ag0Var = (ag0) obj3;
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f22144u;
                if (z3) {
                    if (z3) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                ag0Var.startActivity(new Intent(ag0Var, ag0Var.getClass()).addFlags(131072));
                C1071qh c1071qh = new C1071qh(b2);
                c1071qh.f28461b = (xz4) obj2;
                VarHandle.storeStoreFence();
                vt0 vt0VarM10013H = qq2.m10013H(c1071qh);
                C1108rh c1108rh = new C1108rh(2, wm0Var, b2);
                this.f22144u = true;
                return lb5.m7902J(vt0VarM10013H, c1108rh, this) == ap0Var3 ? ap0Var3 : ju4Var;
            case 3:
                ap0 ap0Var4 = ap0.f14763a;
                boolean z4 = this.f22144u;
                if (!z4) {
                    k43.m7376J(obj);
                    String str = (String) ((g44) obj2).getValue();
                    this.f22144u = true;
                    obj = ((mq1) obj3).invoke(str, this);
                    if (obj == ap0Var4) {
                        return ap0Var4;
                    }
                } else {
                    if (!z4) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                C0766im c0766im = (C0766im) obj;
                if (c0766im != null) {
                    return c0766im.f21545b;
                }
                return null;
            case 4:
                ap0 ap0Var5 = ap0.f14763a;
                boolean z5 = this.f22144u;
                if (!z5) {
                    k43.m7376J(obj);
                    this.f22144u = true;
                    Object objM13187b = ((C1375yo) obj3).m13187b((vt1) obj2, this);
                    return objM13187b == ap0Var5 ? ap0Var5 : objM13187b;
                }
                if (z5) {
                    k43.m7376J(obj);
                    return obj;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                C0668fy c0668fy = (C0668fy) obj2;
                d83 d83Var = ((C0705gy) obj3).f20182c;
                ap0 ap0Var6 = ap0.f14763a;
                boolean z6 = this.f22144u;
                try {
                    if (!z6) {
                        k43.m7376J(obj);
                        d83Var.setValue(c0668fy);
                        this.f22144u = true;
                        Object objMo3509d2 = c0668fy.f19406b.mo3509d(this);
                        if (objMo3509d2 != ap0Var6) {
                            objMo3509d2 = ju4Var;
                        }
                        if (objMo3509d2 == ap0Var6) {
                            return ap0Var6;
                        }
                    } else {
                        if (!z6) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                    }
                    d83Var.setValue(null);
                    return ju4Var;
                } catch (Throwable th2) {
                    d83Var.setValue(null);
                    throw th2;
                }
            case 6:
                ap0 ap0Var7 = ap0.f14763a;
                boolean z7 = this.f22144u;
                if (!z7) {
                    k43.m7376J(obj);
                    yp1 yp1VarMo6046b = ((pn0) obj3).mo6046b();
                    if (yp1VarMo6046b != null) {
                        this.f22144u = true;
                        if (yp1VarMo6046b.invoke(this) == ap0Var7) {
                            return ap0Var7;
                        }
                    }
                } else {
                    if (!z7) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                Iterator it = ((Set) obj2).iterator();
                while (it.hasNext()) {
                    ((sw2) it.next()).setValue(null);
                }
                return ju4Var;
            case 7:
                ap0 ap0Var8 = ap0.f14763a;
                boolean z8 = this.f22144u;
                if (z8) {
                    if (z8) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                Object obj4 = ((at0) obj2).f14852b;
                this.f22144u = true;
                Object objInvoke = ((mq1) obj3).invoke(obj4, this);
                return objInvoke == ap0Var8 ? ap0Var8 : objInvoke;
            case 8:
                ap0 ap0Var9 = ap0.f14763a;
                boolean z9 = this.f22144u;
                if (!z9) {
                    k43.m7376J(obj);
                    this.f22144u = true;
                    return ((hn4) obj3).m6458d((oh4) obj2, this) == ap0Var9 ? ap0Var9 : ju4Var;
                }
                if (z9) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var10 = ap0.f14763a;
                boolean z10 = this.f22144u;
                if (!z10) {
                    k43.m7376J(obj);
                    this.f22144u = true;
                    obj = ((z93) obj3).mo11771c(this);
                    if (obj == ap0Var10) {
                        return ap0Var10;
                    }
                } else {
                    if (!z10) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return ju4Var;
                }
                C1367yg c1367yg = (C1367yg) obj2;
                c1367yg.setValue(Integer.valueOf(((Number) c1367yg.f35202a.getValue()).intValue() != 1 ? (byte) 1 : (byte) 0));
                return ju4Var;
        }
    }
}
