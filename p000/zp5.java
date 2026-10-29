package p000;

import android.app.Application;
import android.content.SharedPreferences;
import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zp5 implements dr6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f36257a;

    /* JADX INFO: renamed from: b */
    public C1392z4 f36258b;

    public /* synthetic */ zp5(byte b) {
        this.f36257a = b;
    }

    @Override // p000.dr6
    /* JADX INFO: renamed from: j */
    public final Object mo4146j() {
        switch (this.f36257a) {
            case 0:
                Application application = (Application) this.f36258b.f35744a;
                up5 up5Var = new up5();
                up5Var.f32068b = new AtomicReference();
                up5Var.f32069c = new AtomicReference();
                up5Var.f32070d = new AtomicReference();
                up5Var.f32071e = new AtomicReference();
                up5Var.f32072f = new AtomicReference();
                up5Var.f32073g = new AtomicReference();
                up5Var.f32067a = application.getApplicationContext();
                VarHandle.storeStoreFence();
                return up5Var;
            case 1:
                Application application2 = (Application) this.f36258b.f35744a;
                mq5 mq5Var = new mq5();
                mq5Var.f25151a = application2;
                SharedPreferences sharedPreferences = application2.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
                mq5Var.f25152b = sharedPreferences;
                mq5Var.f25153c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
                VarHandle.storeStoreFence();
                return mq5Var;
            default:
                Application application3 = (Application) this.f36258b.f35744a;
                yw5 yw5Var = new yw5();
                yw5Var.f35570c = null;
                yw5Var.f35572e = null;
                yw5Var.f35568a = application3;
                VarHandle.storeStoreFence();
                return yw5Var;
        }
    }
}
