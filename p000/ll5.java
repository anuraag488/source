package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ll5 extends i25 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ byte f24140j;

    @Override // p000.i25
    /* JADX INFO: renamed from: i */
    public InterfaceC1074qk mo6631i(Context context, Looper looper, C0602e8 c0602e8, Object obj, rt1 rt1Var, st1 st1Var) {
        switch (this.f24140j) {
            case 0:
                Object obj2 = c0602e8.f17872f;
                Integer num = (Integer) c0602e8.f17867a;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                p64 p64Var = new p64(context, looper, 44, c0602e8, rt1Var, st1Var);
                p64Var.f27403c = true;
                p64Var.f27404d = c0602e8;
                p64Var.f27405e = bundle;
                p64Var.f27406f = (Integer) c0602e8.f17867a;
                VarHandle.storeStoreFence();
                return p64Var;
            case 1:
                throw zi4.m13616p(obj);
            default:
                return super.mo6631i(context, looper, c0602e8, obj, rt1Var, st1Var);
        }
    }

    @Override // p000.i25
    /* JADX INFO: renamed from: j */
    public InterfaceC1074qk mo6632j(Context context, Looper looper, C0602e8 c0602e8, Object obj, ol5 ol5Var, ol5 ol5Var2) {
        switch (this.f24140j) {
            case 2:
                im5 im5Var = new im5(context, looper, 270, c0602e8, ol5Var, ol5Var2);
                im5Var.f21563c = (si4) obj;
                VarHandle.storeStoreFence();
                return im5Var;
            case 3:
                t06 t06Var = new t06(context, looper, 23, c0602e8, ol5Var, ol5Var2);
                t06Var.f30712c = new x64(0);
                t06Var.f30713d = new x64(0);
                t06Var.f30714e = new x64(0);
                VarHandle.storeStoreFence();
                return t06Var;
            case 4:
                return new vy5(context, looper, 300, c0602e8, ol5Var, ol5Var2);
            default:
                return super.mo6632j(context, looper, c0602e8, obj, ol5Var, ol5Var2);
        }
    }
}
