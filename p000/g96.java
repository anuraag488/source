package p000;

import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g96 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19678a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ n96 f19679b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f19680c;

    public /* synthetic */ g96(byte b) {
        this.f19678a = b;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        switch (this.f19678a) {
            case 0:
                n96 n96Var = this.f19679b;
                String str = this.f19680c;
                g96 g96Var = new g96((byte) 1);
                g96Var.f19679b = n96Var;
                g96Var.f19680c = str;
                VarHandle.storeStoreFence();
                ee6 ee6Var = new ee6("internal.appMetadata", (byte) 3);
                ee6Var.f18038d = g96Var;
                VarHandle.storeStoreFence();
                return ee6Var;
            case 1:
                n96 n96Var2 = this.f19679b;
                ar5 ar5Var = n96Var2.f19870f.f28593c;
                qm6.m9925S(ar5Var);
                String str2 = this.f19680c;
                z76 z76VarM3212y0 = ar5Var.m3212y0(str2);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str2);
                ((oa6) n96Var2.f36084a).f26512d.m9235z();
                map.put("gmp_version", 130000L);
                if (z76VarM3212y0 != null) {
                    String strM13414N = z76VarM3212y0.m13414N();
                    if (strM13414N != null) {
                        map.put("app_version", strM13414N);
                    }
                    map.put("app_version_int", Long.valueOf(z76VarM3212y0.m13416P()));
                    map.put("dynamite_version", Long.valueOf(z76VarM3212y0.m13421b()));
                }
                return map;
            default:
                n96 n96Var3 = this.f19679b;
                String str3 = this.f19680c;
                yg3 yg3Var = new yg3((byte) 20);
                yg3Var.f35215b = str3;
                Objects.requireNonNull(n96Var3);
                yg3Var.f35216c = n96Var3;
                VarHandle.storeStoreFence();
                dj6 dj6Var = new dj6("internal.remoteConfig", (byte) 0);
                dj6Var.f17272b.put("getValue", new ee6(dj6Var, yg3Var));
                return dj6Var;
        }
    }
}
