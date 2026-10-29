package p000;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jg0 implements bi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22229a;

    public /* synthetic */ jg0(byte b) {
        this.f22229a = b;
    }

    @Override // p000.bi3
    public final Object get() {
        switch (this.f22229a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                qg2 qg2Var = ExecutorsRegistrar.f16303a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                builderDetectNetwork.detectUnbufferedIo();
                return ExecutorsRegistrar.m4073a(Executors.newFixedThreadPool(4, new ns0("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())));
            case 2:
                qg2 qg2Var2 = ExecutorsRegistrar.f16303a;
                return ExecutorsRegistrar.m4073a(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ns0("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())));
            case 3:
                qg2 qg2Var3 = ExecutorsRegistrar.f16303a;
                return ExecutorsRegistrar.m4073a(Executors.newCachedThreadPool(new ns0("Firebase Blocking", 11, null)));
            case 4:
                qg2 qg2Var4 = ExecutorsRegistrar.f16303a;
                return Executors.newSingleThreadScheduledExecutor(new ns0("Firebase Scheduler", 0, null));
            case 5:
            default:
                return null;
        }
    }
}
