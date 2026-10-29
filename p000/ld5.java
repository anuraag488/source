package p000;

import ads_mobile_sdk.dg3;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import internal.p002J.AbstractC0768N;
import org.chromium.net.X509Util;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ld5 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23964a;

    public /* synthetic */ ld5(byte b) {
        this.f23964a = b;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f23964a) {
            case 0:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        gq6.f20052q = (byte) 1;
                    } else if (intExtra == 1) {
                        gq6.f20052q = (byte) 2;
                    }
                }
                break;
            case 1:
                dg3 dg3Var = dg3.f2483d;
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    dg3Var.m690a(true, dg3Var.f2486c);
                    dg3Var.f2485b = true;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    dg3Var.m690a(false, dg3Var.f2486c);
                    dg3Var.f2485b = false;
                }
                break;
            default:
                if ("android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction())) {
                    rn5 rn5Var = X509Util.sCertVerifier;
                    rn5Var.f29466b = rn5Var.f29465a.supply();
                    AbstractC0768N.M6C2IQIc();
                    break;
                } else if ("android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction())) {
                    AbstractC0768N.MJdorYDE();
                    break;
                } else if ("android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) && !intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false)) {
                    AbstractC0768N.MJdorYDE();
                    break;
                }
                break;
        }
    }
}
