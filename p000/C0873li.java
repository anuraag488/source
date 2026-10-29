package p000;

import android.app.SearchManager;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: li */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0873li extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f24040t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f24041u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0873li(Object obj, wm0 wm0Var, byte b) {
        super(1, wm0Var);
        this.f24040t = b;
        this.f24041u = obj;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        byte b = this.f24040t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f24041u;
        wm0 wm0Var = (wm0) obj;
        switch (b) {
            case 0:
                new C0873li((C0910mi) obj2, wm0Var, (byte) 0).invokeSuspend(ju4Var);
                break;
            case 1:
                new C0873li((SearchManager) obj2, wm0Var, (byte) 1).invokeSuspend(ju4Var);
                break;
            default:
                new C0873li((yp1) obj2, wm0Var, (byte) 2).invokeSuspend(ju4Var);
                break;
        }
        return ju4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
        byte b = this.f24040t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f24041u;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                ((C0910mi) obj2).m8327c();
                break;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                SearchManager.class.getDeclaredMethod("launchAssist", Bundle.class).invoke((SearchManager) obj2, new Bundle());
                break;
            default:
                ap0 ap0Var3 = ap0.f14763a;
                k43.m7376J(obj);
                ((yp1) obj2).invoke("Please reconfigure action!");
                break;
        }
        return ju4Var;
    }
}
