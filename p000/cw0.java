package p000;

import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.lang.invoke.VarHandle;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cw0 implements gg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16522a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ni3 f16523b;

    public /* synthetic */ cw0(byte b) {
        this.f16522a = b;
    }

    @Override // p000.gg0
    /* JADX INFO: renamed from: e */
    public final Object mo3007e(C0602e8 c0602e8) {
        byte b = this.f16522a;
        ni3 ni3Var = this.f16523b;
        switch (b) {
            case 0:
                Context context = (Context) c0602e8.mo4017a(Context.class);
                String strM6390d = ((hg1) c0602e8.mo4017a(hg1.class)).m6390d();
                Set setMo4019c = c0602e8.mo4019c(ni3.m8779a(wv1.class));
                bi3 bi3VarMo4020d = c0602e8.mo4020d(fx0.class);
                Executor executor = (Executor) c0602e8.mo4023g(ni3Var);
                kg0 kg0Var = new kg0((byte) 1);
                kg0Var.f23104b = context;
                kg0Var.f23105c = strM6390d;
                VarHandle.storeStoreFence();
                qg2 qg2Var = new qg2(kg0Var);
                ew0 ew0Var = new ew0();
                ew0Var.f18532a = qg2Var;
                ew0Var.f18535d = setMo4019c;
                ew0Var.f18536e = executor;
                ew0Var.f18534c = bi3VarMo4020d;
                ew0Var.f18533b = context;
                VarHandle.storeStoreFence();
                return ew0Var;
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(ni3Var, c0602e8);
        }
    }
}
