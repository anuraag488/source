package p000;

import ads_mobile_sdk.C0052br;
import ads_mobile_sdk.C0133gf;
import ads_mobile_sdk.C0200km;
import ads_mobile_sdk.C0391wo;
import ads_mobile_sdk.ax3;
import ads_mobile_sdk.c73;
import ads_mobile_sdk.jo1;
import ads_mobile_sdk.kc1;
import ads_mobile_sdk.n00;
import ads_mobile_sdk.pf2;
import ads_mobile_sdk.sg0;
import ads_mobile_sdk.z01;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.widget.Toast;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: j6 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0787j6 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f22035t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Context f22036u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ String f22037v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0787j6(Context context, String str, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f22035t = b;
        this.f22036u = context;
        this.f22037v = str;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f22035t;
        String str = this.f22037v;
        Context context = this.f22036u;
        switch (b) {
            case 0:
                return new C0787j6(context, str, wm0Var, (byte) 0);
            case 1:
                return new C0787j6(context, str, wm0Var, (byte) 1);
            default:
                return new C0787j6(context, str, wm0Var, (byte) 2);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22035t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                ((C0787j6) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                return ju4Var;
            case 1:
                ((C0787j6) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                return ju4Var;
            default:
                return ((C0787j6) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        Object objInvoke;
        Object objM10807c;
        switch (this.f22035t) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                Context context = this.f22036u;
                l32 l32VarM7824a = new l32(this.f22037v).m7824a();
                C0751i6 c0751i6 = new C0751i6();
                x45.f33989a.getClass();
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof Application)) {
                    C1077qn.m9987m("The provided application context is not an instance of Application. The Google Mobile Ads SDK should not be used from contexts like BroadcastReceivers, only Services and Activities.");
                    return null;
                }
                if (z01.f13969d.compareAndSet(false, true)) {
                    int i = n00.f7454l;
                    r50 r50Var = i41.f21117b;
                    lb5.m7910S(zp0.m13670b(new ub1(new yt2(new ThreadPoolExecutor(1, 1, i41.m6655n(0L, m41.SECONDS), TimeUnit.SECONDS, new LinkedBlockingQueue(), new ax3("WebView"))))), null, null, new C0052br((Application) applicationContext, null, (byte) 19), 3);
                }
                C0391wo c0391wo = z01.f13968b;
                pf2 pf2Var = new pf2(context, (Application) applicationContext, (byte) 5);
                synchronized (c0391wo) {
                    objInvoke = c0391wo.f13023a;
                    if (objInvoke == null) {
                        objInvoke = pf2Var.invoke();
                        c0391wo.f13023a = objInvoke;
                    }
                    break;
                }
                sg0 sg0Var = (sg0) ((x45) objInvoke);
                ((kc1) sg0Var.f11425d.get()).f6158a = l32VarM7824a;
                c73 c73Var = (c73) sg0Var.f11372U0.get();
                go3 go3Var = l32VarM7824a.f23762b;
                C0200km c0200km = c73Var.f1837a;
                ic2 ic2Var = c73.f1836b[0];
                c0200km.setValue(c73Var, go3Var);
                jo1 jo1Var = (jo1) sg0Var.f11293E3.get();
                jo1Var.getClass();
                C0638f5.m5528H(new C0133gf(jo1Var, c0751i6, (wm0) null, (byte) 2));
                synchronized (zt5.f36368d) {
                }
                return ju4.f22634a;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                Toast.makeText(this.f22036u, this.f22037v, 0).show();
                return ju4.f22634a;
            default:
                ap0 ap0Var3 = ap0.f14763a;
                k43.m7376J(obj);
                Context context2 = this.f22036u;
                String str = this.f22037v;
                try {
                    objM10807c = context2.getPackageManager().getApplicationInfo(str, 0);
                    break;
                } catch (Throwable th) {
                    sc6.m10643O(th);
                    objM10807c = sj3.m10807c(th);
                }
                if (!(objM10807c instanceof yc1)) {
                    try {
                        objM10807c = new C0766im(str, ((ApplicationInfo) objM10807c).loadLabel(context2.getPackageManager()).toString());
                    } catch (Throwable th2) {
                        sc6.m10643O(th2);
                        objM10807c = sj3.m10807c(th2);
                    }
                }
                if (objM10807c instanceof yc1) {
                    return null;
                }
                return objM10807c;
        }
    }
}
