package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivityV2;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k16 implements InterfaceC1355y4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22819a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ProxyBillingActivityV2 f22820b;

    @Override // p000.InterfaceC1355y4
    /* JADX INFO: renamed from: b */
    public final void mo7271b(Object obj) {
        byte b = this.f22819a;
        ProxyBillingActivityV2 proxyBillingActivityV2 = this.f22820b;
        C1318x4 c1318x4 = (C1318x4) obj;
        switch (b) {
            case 0:
                Intent intent = c1318x4.f33969b;
                int i = qv5.m10137e(intent, "ProxyBillingActivityV2").f18622a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.f16198B;
                if (resultReceiver != null) {
                    resultReceiver.send(i, intent != null ? intent.getExtras() : null);
                }
                int i2 = c1318x4.f33968a;
                if (i2 != -1 || i != 0) {
                    qv5.m10140h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
                }
                proxyBillingActivityV2.finish();
                break;
            case 1:
                Intent intent2 = c1318x4.f33969b;
                int i3 = c1318x4.f33968a;
                Bundle extras = intent2 != null ? intent2.getExtras() : null;
                if (i3 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    qv5.m10140h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i3);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i3);
                }
                int i4 = qv5.m10137e(intent2, "ProxyBillingActivityV2").f18622a;
                ResultReceiver resultReceiver2 = proxyBillingActivityV2.f16200D;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(i4, extras);
                } else {
                    qv5.m10140h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i4 != 0) {
                    qv5.m10140h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i4);
                }
                proxyBillingActivityV2.finish();
                break;
            default:
                Intent intent3 = c1318x4.f33969b;
                int i5 = qv5.m10137e(intent3, "ProxyBillingActivityV2").f18622a;
                ResultReceiver resultReceiver3 = proxyBillingActivityV2.f16202F;
                if (resultReceiver3 != null) {
                    resultReceiver3.send(i5, intent3 != null ? intent3.getExtras() : null);
                }
                int i6 = c1318x4.f33968a;
                if (i6 != -1 || i5 != 0) {
                    qv5.m10140h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i6 + " and billing's responseCode: " + i5);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }
}
