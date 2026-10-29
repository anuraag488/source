package com.android.billingclient.api;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.invoke.VarHandle;
import p000.C0006a5;
import p000.C0638f5;
import p000.ag0;
import p000.ar3;
import p000.b62;
import p000.k16;
import p000.m16;
import p000.qv5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivityV2 extends ag0 {

    /* JADX INFO: renamed from: A */
    public C0638f5 f16197A;

    /* JADX INFO: renamed from: B */
    public ResultReceiver f16198B;

    /* JADX INFO: renamed from: C */
    public ResultReceiver f16199C;

    /* JADX INFO: renamed from: D */
    public ResultReceiver f16200D;

    /* JADX INFO: renamed from: E */
    public ResultReceiver f16201E;

    /* JADX INFO: renamed from: F */
    public ResultReceiver f16202F;

    /* JADX INFO: renamed from: G */
    public ResultReceiver f16203G;

    /* JADX INFO: renamed from: v */
    public C0638f5 f16204v;

    /* JADX INFO: renamed from: w */
    public C0638f5 f16205w;

    /* JADX INFO: renamed from: x */
    public C0638f5 f16206x;

    /* JADX INFO: renamed from: y */
    public C0638f5 f16207y;

    /* JADX INFO: renamed from: z */
    public C0638f5 f16208z;

    /* JADX INFO: renamed from: j */
    public static final ar3 m4059j() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            ar3 ar3Var = new ar3((byte) 6);
            ar3Var.f14813b = activityOptionsMakeBasic;
            VarHandle.storeStoreFence();
            if (i >= 34) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(3);
                return ar3Var;
            }
            activityOptionsMakeBasic.setPendingIntentBackgroundActivityLaunchAllowed(true);
            return ar3Var;
        }
        if (i < 34) {
            return null;
        }
        ActivityOptions activityOptionsMakeBasic2 = ActivityOptions.makeBasic();
        ar3 ar3Var2 = new ar3((byte) 6);
        ar3Var2.f14813b = activityOptionsMakeBasic2;
        VarHandle.storeStoreFence();
        if (i >= 34) {
            activityOptionsMakeBasic2.setPendingIntentBackgroundActivityStartMode(1);
            return ar3Var2;
        }
        activityOptionsMakeBasic2.setPendingIntentBackgroundActivityLaunchAllowed(true);
        return ar3Var2;
    }

    @Override // p000.ag0, android.app.Activity
    public final void onCreate(Bundle bundle) throws Exception {
        super.onCreate(bundle);
        C0006a5 c0006a5 = new C0006a5((byte) 2);
        k16 k16Var = new k16((byte) 0);
        k16Var.f22820b = this;
        VarHandle.storeStoreFence();
        this.f16204v = m2981i(k16Var, c0006a5);
        C0006a5 c0006a6 = new C0006a5((byte) 2);
        m16 m16Var = new m16((byte) 0);
        m16Var.f24583b = this;
        VarHandle.storeStoreFence();
        this.f16205w = m2981i(m16Var, c0006a6);
        C0006a5 c0006a7 = new C0006a5((byte) 2);
        k16 k16Var2 = new k16((byte) 1);
        k16Var2.f22820b = this;
        VarHandle.storeStoreFence();
        this.f16206x = m2981i(k16Var2, c0006a7);
        C0006a5 c0006a8 = new C0006a5((byte) 2);
        m16 m16Var2 = new m16((byte) 1);
        m16Var2.f24583b = this;
        VarHandle.storeStoreFence();
        this.f16207y = m2981i(m16Var2, c0006a8);
        C0006a5 c0006a9 = new C0006a5((byte) 2);
        k16 k16Var3 = new k16((byte) 2);
        k16Var3.f22820b = this;
        VarHandle.storeStoreFence();
        this.f16208z = m2981i(k16Var3, c0006a9);
        C0006a5 c0006a10 = new C0006a5((byte) 2);
        m16 m16Var3 = new m16((byte) 2);
        m16Var3.f24583b = this;
        VarHandle.storeStoreFence();
        this.f16197A = m2981i(m16Var3, c0006a10);
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f16198B = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.f16199C = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.f16200D = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.f16201E = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
            }
            if (bundle.containsKey("billing_program_information_dialog_result_receiver")) {
                this.f16202F = (ResultReceiver) bundle.getParcelable("billing_program_information_dialog_result_receiver");
            }
            if (bundle.containsKey("subscription_management_action_result_receiver")) {
                this.f16203G = (ResultReceiver) bundle.getParcelable("subscription_management_action_result_receiver");
                return;
            }
            return;
        }
        qv5.m10139g("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f16198B = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f16204v.m5556C(new b62(pendingIntent.getIntentSender(), null, 0, 0), m4059j());
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f16199C = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f16205w.m5556C(new b62(pendingIntent2.getIntentSender(), null, 0, 0), m4059j());
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.f16200D = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            this.f16206x.m5556C(new b62(pendingIntent3.getIntentSender(), null, 0, 0), m4059j());
            return;
        }
        if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.f16201E = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            this.f16207y.m5556C(new b62(pendingIntent4.getIntentSender(), null, 0, 0), m4059j());
        } else if (getIntent().hasExtra("billing_program_information_dialog_pending_intent")) {
            PendingIntent pendingIntent5 = (PendingIntent) getIntent().getParcelableExtra("billing_program_information_dialog_pending_intent");
            this.f16202F = (ResultReceiver) getIntent().getParcelableExtra("billing_program_information_dialog_result_receiver");
            this.f16208z.m5556C(new b62(pendingIntent5.getIntentSender(), null, 0, 0), m4059j());
        } else if (getIntent().hasExtra("SUBSCRIPTION_MANAGEMENT_INTENT")) {
            PendingIntent pendingIntent6 = (PendingIntent) getIntent().getParcelableExtra("SUBSCRIPTION_MANAGEMENT_INTENT");
            this.f16203G = (ResultReceiver) getIntent().getParcelableExtra("subscription_management_action_result_receiver");
            this.f16197A.m5556C(new b62(pendingIntent6.getIntentSender(), null, 0, 0), m4059j());
        }
    }

    @Override // p000.ag0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f16198B;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f16199C;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f16200D;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.f16201E;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
        ResultReceiver resultReceiver5 = this.f16202F;
        if (resultReceiver5 != null) {
            bundle.putParcelable("billing_program_information_dialog_result_receiver", resultReceiver5);
        }
        ResultReceiver resultReceiver6 = this.f16203G;
        if (resultReceiver6 != null) {
            bundle.putParcelable("subscription_management_action_result_receiver", resultReceiver6);
        }
    }
}
