package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tf6 implements InterfaceC1261vm {

    /* JADX INFO: renamed from: d */
    public static tf6 f31126d;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31127a;

    /* JADX INFO: renamed from: b */
    public Object f31128b;

    /* JADX INFO: renamed from: c */
    public Object f31129c;

    public /* synthetic */ tf6(byte b) {
        this.f31127a = b;
    }

    /* JADX INFO: renamed from: b */
    public static final SharedPreferences m11047b(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    /* JADX INFO: renamed from: c */
    public static final void m11048c(Context context) throws de6 {
        if (m11047b(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new de6("Failed to store the app set ID last used time.");
    }

    @Override // p000.InterfaceC1261vm
    /* JADX INFO: renamed from: a */
    public final nr6 mo3636a() {
        switch (this.f31127a) {
            case 0:
                li4 li4Var = new li4();
                ExecutorService executorService = (ExecutorService) this.f31129c;
                oz5 oz5Var = new oz5((byte) 19);
                oz5Var.f27249b = this;
                oz5Var.f27250c = li4Var;
                VarHandle.storeStoreFence();
                executorService.execute(oz5Var);
                return li4Var.f24059a;
            default:
                nr6 nr6VarMo3636a = ((bm6) this.f31128b).mo3636a();
                bt5 bt5Var = new bt5((byte) 16);
                bt5Var.f15596b = this;
                VarHandle.storeStoreFence();
                nr6VarMo3636a.getClass();
                return nr6VarMo3636a.m8822f(mi4.f24958a, bt5Var);
        }
    }
}
