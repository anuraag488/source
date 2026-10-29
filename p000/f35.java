package p000;

import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f35 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f18719t;

    /* JADX INFO: renamed from: u */
    public boolean f18720u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ h35 f18721v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f35(h35 h35Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f18719t = b;
        this.f18721v = h35Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f18719t;
        h35 h35Var = this.f18721v;
        switch (b) {
            case 0:
                return new f35(h35Var, wm0Var, (byte) 0);
            default:
                return new f35(h35Var, wm0Var, (byte) 1);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18719t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((f35) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Throwable {
        e35 d35Var;
        byte b = this.f18719t;
        h35 h35Var = this.f18721v;
        wm0 wm0Var = null;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f18720u;
                if (!z) {
                    k43.m7376J(obj);
                    this.f18720u = true;
                    Object objM6215f = h35Var.m6215f(this);
                    return objM6215f == ap0Var ? ap0Var : objM6215f;
                }
                if (z) {
                    k43.m7376J(obj);
                    return obj;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f18720u;
                byte b2 = 0;
                try {
                    if (!z2) {
                        k43.m7376J(obj);
                        v82 v82Var = h35Var.f20352l;
                        f35 f35Var = new f35(h35Var, wm0Var, b2);
                        this.f18720u = true;
                        obj = lb5.m7921b0(v82Var, f35Var, this);
                        if (obj == ap0Var2) {
                            return ap0Var2;
                        }
                    } else {
                        if (!z2) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                    }
                    d35Var = (e35) obj;
                    break;
                } catch (y25 e) {
                    int i = e.f34826a;
                    c35 c35Var = new c35();
                    c35Var.f15788a = i;
                    VarHandle.storeStoreFence();
                    d35Var = c35Var;
                } catch (CancellationException unused) {
                    d35Var = new a35();
                } catch (Throwable th) {
                    wn2.m12326e().m12330d(i35.f21109a, "Unexpected error in WorkerWrapper", th);
                    d35Var = new d35(false);
                }
                if (h35Var.f20353m) {
                    h35Var.f20345e.getClass();
                }
                ml3 ml3Var = new ml3();
                WorkDatabase workDatabase = h35Var.f20347g;
                RunnableC0612eh runnableC0612eh = new RunnableC0612eh((byte) 7);
                runnableC0612eh.f18081b = d35Var;
                runnableC0612eh.f18082c = ml3Var;
                runnableC0612eh.f18083d = h35Var;
                VarHandle.storeStoreFence();
                workDatabase.m3074q(runnableC0612eh);
                return Boolean.valueOf(ml3Var.f25002a);
        }
    }
}
