package p000;

import android.os.Bundle;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hn0 extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f20712t;

    /* JADX INFO: renamed from: u */
    public boolean f20713u;

    /* JADX INFO: renamed from: v */
    public Object f20714v;

    /* JADX INFO: renamed from: w */
    public Object f20715w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f20716x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f20717y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hn0(Object obj, Object obj2, Object obj3, Object obj4, wm0 wm0Var, byte b) {
        super(1, wm0Var);
        this.f20712t = b;
        this.f20714v = obj;
        this.f20715w = obj2;
        this.f20716x = obj3;
        this.f20717y = obj4;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f20712t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f20717y;
        Object obj3 = this.f20716x;
        switch (b) {
            case 0:
                return new hn0((InterfaceC0755ia) this.f20714v, (yp1) this.f20715w, (String) obj3, (sn0) obj2, (wm0) obj, (byte) 0).invokeSuspend(ju4Var);
            case 1:
                return new hn0((ru0) this.f20714v, (gh3) this.f20715w, (ro0) obj3, (mq1) obj2, (wm0) obj, (byte) 1).invokeSuspend(ju4Var);
            default:
                return new hn0((sf1) obj3, obj2, (wm0) obj).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Exception {
        Throwable th;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        byte b = this.f20712t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f20717y;
        Object obj3 = this.f20716x;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f20713u;
                if (z) {
                    if (z) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                InterfaceC0755ia interfaceC0755ia = (InterfaceC0755ia) this.f20714v;
                if (interfaceC0755ia != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("source", (String) obj3);
                    bundle.putString("type", ((sn0) obj2).f30400a);
                    interfaceC0755ia.mo6706b("control_fired", bundle);
                }
                yp1 yp1Var = (yp1) this.f20715w;
                this.f20713u = true;
                return yp1Var.invoke(this) == ap0Var ? ap0Var : ju4Var;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f20713u;
                if (z2) {
                    if (z2) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                ru0 ru0Var = (ru0) this.f20714v;
                ru0Var.getClass();
                gh3 gh3Var = (gh3) this.f20715w;
                nu0 nu0Var = new nu0((Object) ru0Var, obj3, obj2, (wm0) null, (byte) 0);
                this.f20713u = true;
                Object objM7917Z = lb5.m7917Z("DataStore.transformAndWrite", gh3Var, nu0Var, this);
                return objM7917Z == ap0Var2 ? ap0Var2 : objM7917Z;
            default:
                sf1 sf1Var = (sf1) obj3;
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f20713u;
                if (!z3) {
                    k43.m7376J(obj);
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(sf1Var.f15233a);
                        try {
                            t24 t24Var = sf1Var.f15234b;
                            xt4 xt4Var = new xt4();
                            xt4Var.f34621a = fileOutputStream3;
                            VarHandle.storeStoreFence();
                            this.f20714v = fileOutputStream3;
                            this.f20715w = fileOutputStream3;
                            this.f20713u = true;
                            t24Var.writeTo(obj2, xt4Var);
                            if (ju4Var == ap0Var3) {
                                return ap0Var3;
                            }
                            fileOutputStream = fileOutputStream3;
                            fileOutputStream2 = fileOutputStream;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream3;
                            throw th;
                        }
                    } catch (Exception e) {
                        if (e instanceof FileNotFoundException) {
                            throw AbstractC1356y5.m12905N(sf1Var.f15233a.getParent(), (FileNotFoundException) e);
                        }
                        throw e;
                    }
                } else {
                    if (!z3) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileOutputStream2 = (FileOutputStream) this.f20715w;
                    fileOutputStream = (FileOutputStream) this.f20714v;
                    try {
                        k43.m7376J(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            lb5.m7941v(fileOutputStream, th);
                            throw th4;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                lb5.m7941v(fileOutputStream, null);
                return ju4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn0(sf1 sf1Var, Object obj, wm0 wm0Var) {
        super(1, wm0Var);
        this.f20712t = (byte) 2;
        this.f20716x = sf1Var;
        this.f20717y = obj;
    }
}
