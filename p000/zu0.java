package p000;

import android.content.Context;
import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zu0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f36378a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ a44 f36379b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Context f36380c;

    public /* synthetic */ zu0(byte b) {
        this.f36378a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f36378a;
        ju4 ju4Var = ju4.f22634a;
        byte b2 = 0;
        switch (b) {
            case 0:
                a44 a44Var = this.f36379b;
                Context context = this.f36380c;
                kz3 kz3Var = (kz3) obj;
                av0 av0Var = new av0(b2);
                av0Var.f14897b = a44Var;
                av0Var.f14898c = context;
                VarHandle.storeStoreFence();
                byte b3 = 1;
                kz3Var.m7753a(null, new pg0(-743706414, true, av0Var));
                if (yn2.m13181a(a44Var)) {
                    kz3Var.m7753a(null, k43.f22868k);
                }
                av0 av0Var2 = new av0(b3);
                av0Var2.f14897b = a44Var;
                av0Var2.f14898c = context;
                VarHandle.storeStoreFence();
                kz3Var.m7753a(null, new pg0(-2023642309, true, av0Var2));
                kz3Var.m7753a(null, k43.f22872q);
                ch0 ch0Var = new ch0(b3);
                ch0Var.f16014b = a44Var;
                VarHandle.storeStoreFence();
                kz3Var.m7753a(null, new pg0(768226681, true, ch0Var));
                break;
            case 1:
                a44 a44Var2 = this.f36379b;
                Context context2 = this.f36380c;
                vg2 vg2Var = (vg2) obj;
                zu0 zu0Var = new zu0(b2);
                zu0Var.f36379b = a44Var2;
                zu0Var.f36380c = context2;
                VarHandle.storeStoreFence();
                mz3.m8469k(vg2Var, null, zu0Var, 3);
                Iterator it = ((Iterable) vg2Var.f32595b.mo2998b(cv0.f16506d)).iterator();
                while (it.hasNext()) {
                    ((yp1) it.next()).invoke(vg2Var);
                }
                break;
            case 2:
                a44 a44Var3 = this.f36379b;
                Context context3 = this.f36380c;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                tt2 tt2Var = AbstractC1138sa.f30028c;
                ic2 ic2Var = AbstractC1138sa.f30026a[0];
                tt2Var.m11144C(a44Var3, bool);
                i25.m6605D(context3);
                break;
            default:
                a44 a44Var4 = this.f36379b;
                Context context4 = this.f36380c;
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                tt2 tt2Var2 = yn2.f35358c;
                ic2 ic2Var2 = yn2.f35356a[0];
                tt2Var2.m11144C(a44Var4, bool2);
                i25.m6605D(context4);
                break;
        }
        return ju4Var;
    }
}
