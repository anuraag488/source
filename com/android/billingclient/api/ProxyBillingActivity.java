package com.android.billingclient.api;

import ads_mobile_sdk.C0313rh;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.invoke.VarHandle;
import p000.d55;
import p000.e00;
import p000.eg6;
import p000.f00;
import p000.kz5;
import p000.pe6;
import p000.pq3;
import p000.qv5;
import p000.re6;
import p000.v16;
import p000.xd6;
import p000.zf6;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public ResultReceiver f16189a;

    /* JADX INFO: renamed from: b */
    public boolean f16190b;

    /* JADX INFO: renamed from: c */
    public boolean f16191c;

    /* JADX INFO: renamed from: d */
    public int f16192d;

    /* JADX INFO: renamed from: e */
    public long f16193e;

    /* JADX INFO: renamed from: f */
    public boolean f16194f;

    /* JADX INFO: renamed from: g */
    public v16 f16195g;

    /* JADX INFO: renamed from: h */
    public pq3 f16196h;

    /* JADX INFO: renamed from: a */
    public static int m4056a(Intent intent, int i) {
        if (intent != null) {
            if (intent.getExtras() == null) {
                return 22;
            }
            return i == 5 ? 139 : 1;
        }
        if (i == -1) {
            return 113;
        }
        if (i == 0) {
            return 114;
        }
        if (i != 3) {
            return i != 4 ? 117 : 116;
        }
        return 115;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    /* JADX INFO: renamed from: b */
    public final Intent m4057b(int i, long j, boolean z) {
        f00 f00Var;
        Intent intentM4058c = m4058c();
        xd6 xd6Var = xd6.f34175b;
        if (z) {
            v16 v16Var = this.f16195g;
            if (v16Var != null && (f00Var = v16Var.f32319a) != null) {
                intentM4058c.putExtra("RESPONSE_CODE", f00Var.f18622a);
                intentM4058c.putExtra("DEBUG_MESSAGE", f00Var.f18624c);
            } else if (v16Var == null || v16Var.f32320b) {
                intentM4058c.putExtra("RESPONSE_CODE", 6);
                intentM4058c.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                e00 e00VarM5438a = f00.m5438a();
                e00VarM5438a.f17552a = 6;
                e00VarM5438a.f17554c = "An internal error occurred.";
                intentM4058c.putExtra("FAILURE_LOGGING_PAYLOAD", kz5.m7757b(i, 2, e00VarM5438a.m4828e(), null, xd6Var).m11237b());
            } else {
                intentM4058c.putExtra("RESPONSE_CODE", 3);
                intentM4058c.putExtra("DEBUG_MESSAGE", "Play Store is blocked.");
                e00 e00VarM5438a2 = f00.m5438a();
                e00VarM5438a2.f17552a = 3;
                e00VarM5438a2.f17554c = "Play Store is blocked.";
                intentM4058c.putExtra("FAILURE_LOGGING_PAYLOAD", kz5.m7757b(142, 2, e00VarM5438a2.m4828e(), null, xd6Var).m11237b());
            }
        } else {
            intentM4058c.putExtra("RESPONSE_CODE", 6);
            intentM4058c.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
            e00 e00VarM5438a3 = f00.m5438a();
            e00VarM5438a3.f17552a = 6;
            e00VarM5438a3.f17554c = "An internal error occurred.";
            intentM4058c.putExtra("FAILURE_LOGGING_PAYLOAD", kz5.m7757b(i, 2, e00VarM5438a3.m4828e(), null, xd6Var).m11237b());
        }
        intentM4058c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentM4058c.putExtra("billingClientTransactionId", j);
        intentM4058c.putExtra("wasServiceAutoReconnected", this.f16194f);
        return intentM4058c;
    }

    /* JADX INFO: renamed from: c */
    public final Intent m4058c() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[PHI: r11
  0x0070: PHI (r11v1 int) = (r11v0 int), (r11v16 int) binds: [B:28:0x006b, B:30:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x0110  */
    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0070, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x008c, please report this as an issue */
    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        int i3;
        int i4;
        String string;
        Intent intentM4058c;
        boolean z2;
        int i5;
        ResultReceiver resultReceiver;
        Bundle extras;
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (intent == null) {
                z = false;
            } else {
                z = true;
            }
            i3 = qv5.m10137e(intent, "ProxyBillingActivity").f18622a;
            i4 = -1;
            if (i2 != -1) {
                qv5.m10140h("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            } else if (i3 != 0) {
                i2 = -1;
                qv5.m10140h("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            }
            if (true != z) {
                qv5.m10140h("ProxyBillingActivity", "Got null data with resultCode " + i4 + "!");
            } else if (intent.getExtras() == null) {
                qv5.m10140h("ProxyBillingActivity", "Got null bundle!");
            }
            if (d55.m4358c(m4056a(intent, i4), 1)) {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent2 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent2.setPackage(getApplicationContext().getPackageName());
                    intent2.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentM4058c = intent2;
                } else {
                    intentM4058c = m4058c();
                    intentM4058c.putExtras(intent.getExtras());
                    intentM4058c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentM4058c.putExtra("billingClientTransactionId", this.f16193e);
                intentM4058c.putExtra("wasServiceAutoReconnected", this.f16194f);
            } else {
                int iM4056a = m4056a(intent, i4);
                long j = this.f16193e;
                if (intent == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                intentM4058c = m4057b(iM4056a, j, z2);
            }
            if (i == 110) {
                intentM4058c.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentM4058c);
        } else if (i == 110) {
            if (intent == null) {
                z = false;
            } else {
                z = true;
            }
            i3 = qv5.m10137e(intent, "ProxyBillingActivity").f18622a;
            i4 = -1;
            if (i2 != -1) {
                qv5.m10140h("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            } else if (i3 != 0) {
                i2 = -1;
                qv5.m10140h("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            }
            if (true != z) {
                qv5.m10140h("ProxyBillingActivity", "Got null data with resultCode " + i4 + "!");
            } else if (intent.getExtras() == null) {
                qv5.m10140h("ProxyBillingActivity", "Got null bundle!");
            }
            if (d55.m4358c(m4056a(intent, i4), 1)) {
                int iM4056a2 = m4056a(intent, i4);
                long j2 = this.f16193e;
                if (intent == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                intentM4058c = m4057b(iM4056a2, j2, z2);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent3 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent3.setPackage(getApplicationContext().getPackageName());
                    intent3.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent3.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentM4058c = intent3;
                } else {
                    intentM4058c = m4058c();
                    intentM4058c.putExtras(intent.getExtras());
                    intentM4058c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentM4058c.putExtra("billingClientTransactionId", this.f16193e);
                intentM4058c.putExtra("wasServiceAutoReconnected", this.f16194f);
            }
            if (i == 110) {
                intentM4058c.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentM4058c);
        } else if (i == 101) {
            int i6 = qv5.f28836a;
            if (intent == null) {
                qv5.m10140h("ProxyBillingActivity", "Got null intent!");
                intent = null;
            } else {
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    qv5.m10140h("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i5 = extras2.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                }
                resultReceiver = this.f16189a;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i5, extras);
                }
            }
            i5 = 0;
            resultReceiver = this.f16189a;
            if (resultReceiver != null) {
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                resultReceiver.send(i5, extras);
            }
        } else {
            qv5.m10140h("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
        }
        this.f16190b = false;
        v16 v16Var = this.f16195g;
        if (v16Var != null) {
            v16Var.f32319a = null;
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean zContainsKey;
        int i;
        PendingIntent pendingIntent;
        Bundle bundle2;
        Bundle bundle3;
        super.onCreate(bundle);
        if (bundle == null) {
            zContainsKey = getIntent() == null ? false : getIntent().hasExtra("IN_APP_MESSAGE_INTENT");
        } else {
            zContainsKey = bundle.containsKey("in_app_message_result_receiver");
        }
        if (!zContainsKey) {
            try {
                i = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                qv5.m10141i("ProxyBillingActivity", "Failed to get package info for current package.", e);
                i = -1;
            }
            if (this.f16196h == null) {
                Context applicationContext = getApplicationContext();
                pe6 pe6VarM10310A = re6.m10310A();
                pe6VarM10310A.m9507g(getPackageName());
                pe6VarM10310A.m9508h();
                pe6VarM10310A.m9504d(i);
                pe6VarM10310A.m9503c(Build.VERSION.SDK_INT);
                pe6VarM10310A.m9506f();
                this.f16196h = new pq3(applicationContext, (re6) pe6VarM10310A.m8970a());
            }
            synchronized (this) {
                try {
                    pq3 pq3Var = this.f16196h;
                    v16 v16Var = new v16();
                    v16Var.f32320b = false;
                    v16Var.f32321c = pq3Var;
                    VarHandle.storeStoreFence();
                    this.f16195g = v16Var;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION");
                    intentFilter.addAction("com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION");
                    registerReceiver(this.f16195g, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, 2);
                } catch (NoSuchMethodError | RuntimeException e2) {
                    this.f16195g = null;
                    boolean z = e2 instanceof NoSuchMethodError;
                    pq3 pq3Var2 = this.f16196h;
                    if (z) {
                        zf6 zf6VarM5125q = eg6.m5125q();
                        zf6VarM5125q.m8971b();
                        eg6.m5126r((eg6) zf6VarM5125q.f26373b, 2);
                        pq3Var2.m9627z((eg6) zf6VarM5125q.m8970a());
                    } else {
                        zf6 zf6VarM5125q2 = eg6.m5125q();
                        zf6VarM5125q2.m8971b();
                        eg6.m5126r((eg6) zf6VarM5125q2.f26373b, 1);
                        pq3Var2.m9627z((eg6) zf6VarM5125q2.m8970a());
                    }
                    qv5.m10141i("ProxyBillingActivity", "Failed to register receiver.", e2);
                }
            }
        }
        if (bundle != null) {
            qv5.m10139g("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f16190b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f16189a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f16191c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f16192d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f16193e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f16194f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        qv5.m10139g("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f16192d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f16191c = true;
                this.f16192d = C0313rh.f10799k1;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f16189a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f16192d = C0313rh.f10756T0;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f16193e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f16194f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.f16190b = true;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 36) {
                if (i2 >= 34) {
                    bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
                } else {
                    bundle2 = null;
                }
                startIntentSenderForResult(pendingIntent.getIntentSender(), this.f16192d, new Intent(), 0, 0, 0, bundle2);
            }
            bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(3).toBundle();
            bundle2 = bundle3;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f16192d, new Intent(), 0, 0, 0, bundle2);
        } catch (IntentSender.SendIntentException e3) {
            qv5.m10141i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e3);
            ResultReceiver resultReceiver = this.f16189a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentM4057b = m4057b(137, this.f16193e, false);
                if (this.f16191c) {
                    intentM4057b.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentM4057b);
            }
            this.f16190b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        f00 f00Var;
        super.onDestroy();
        v16 v16Var = this.f16195g;
        if (v16Var != null) {
            f00Var = v16Var.f32319a;
            try {
                unregisterReceiver(v16Var);
            } catch (RuntimeException e) {
                qv5.m10141i("ProxyBillingActivity", "Failed to unregister receiver.", e);
            }
        } else {
            f00Var = null;
        }
        if (isFinishing() && this.f16190b) {
            Intent intentM4058c = m4058c();
            if (f00Var != null) {
                intentM4058c.putExtra("RESPONSE_CODE", f00Var.f18622a);
                intentM4058c.putExtra("DEBUG_MESSAGE", f00Var.f18624c);
            } else {
                intentM4058c.putExtra("RESPONSE_CODE", 1);
                intentM4058c.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            }
            if (this.f16191c) {
                intentM4058c.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.f16192d;
            if (i == 110 || i == 100) {
                intentM4058c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentM4058c.putExtra("billingClientTransactionId", this.f16193e);
            }
            sendBroadcast(intentM4058c);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f16189a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f16190b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f16191c);
        bundle.putInt("activity_code", this.f16192d);
        bundle.putLong("billingClientTransactionId", this.f16193e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f16194f);
    }
}
