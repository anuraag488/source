package p000;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d82 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16856a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e82 f16857b;

    public /* synthetic */ d82(byte b) {
        this.f16856a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f16856a;
        e82 e82Var = this.f16857b;
        switch (b) {
            case 0:
                Log.w(rl3.m10361a(e82.class).m10249b(), "CorruptionException in " + e82Var.f17878a + " DataStore running in process " + Process.myPid(), (gp0) obj);
                return new hw2(true);
            default:
                Context context = (Context) obj;
                String str = e82Var.f17878a;
                wm0 wm0Var = null;
                C1260vl c1260vl = new C1260vl((Object) g54.f19620a, wm0Var, (byte) 15);
                f54 f54Var = new f54(3, wm0Var);
                int i = h54.f20401a;
                jp1 jp1Var = new jp1((byte) 19);
                jp1Var.f22485b = context;
                jp1Var.f22486c = str;
                VarHandle.storeStoreFence();
                e54 e54Var = new e54();
                e54Var.f17710a = c1260vl;
                e54Var.f17711b = f54Var;
                e54Var.f17712c = context;
                e54Var.f17713d = str;
                e54Var.f17714e = new dg4(jp1Var);
                e54Var.f17715f = null;
                VarHandle.storeStoreFence();
                return Collections.singletonList(e54Var);
        }
    }
}
