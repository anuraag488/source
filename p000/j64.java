package p000;

import android.content.Context;
import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j64 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22053a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f22054b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ mq1 f22055c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ yp1 f22056d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Context f22057e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ yp1 f22058f;

    public /* synthetic */ j64(byte b) {
        this.f22053a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f22053a;
        ju4 ju4Var = ju4.f22634a;
        byte b2 = 0;
        switch (b) {
            case 0:
                List list = this.f22054b;
                mq1 mq1Var = this.f22055c;
                yp1 yp1Var = this.f22056d;
                Context context = this.f22057e;
                yp1 yp1Var2 = this.f22058f;
                kz3 kz3Var = (kz3) obj;
                for (Object obj2 : list) {
                    l64 l64Var = new l64(b2);
                    l64Var.f23821b = obj2;
                    l64Var.f23822c = mq1Var;
                    l64Var.f23823d = yp1Var;
                    l64Var.f23825f = context;
                    l64Var.f23824e = yp1Var2;
                    VarHandle.storeStoreFence();
                    kz3Var.m7753a(null, new pg0(-1568955183, true, l64Var));
                }
                break;
            default:
                List<l73> list2 = this.f22054b;
                mq1 mq1Var2 = this.f22055c;
                yp1 yp1Var3 = this.f22056d;
                Context context2 = this.f22057e;
                yp1 yp1Var4 = this.f22058f;
                vg2 vg2Var = (vg2) obj;
                for (l73 l73Var : list2) {
                    String str = (String) l73Var.f23833a;
                    List list3 = (List) l73Var.f23834b;
                    C0914mm c0914mm = new C0914mm((byte) 4);
                    c0914mm.f25018b = str;
                    VarHandle.storeStoreFence();
                    pg0 pg0Var = new pg0(1717625692, true, c0914mm);
                    j64 j64Var = new j64(b2);
                    j64Var.f22054b = list3;
                    j64Var.f22055c = mq1Var2;
                    j64Var.f22056d = yp1Var3;
                    j64Var.f22057e = context2;
                    j64Var.f22058f = yp1Var4;
                    VarHandle.storeStoreFence();
                    mz3.m8469k(vg2Var, pg0Var, j64Var, 2);
                }
                break;
        }
        return ju4Var;
    }
}
