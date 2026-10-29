package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import p000.km5;
import p000.lk0;
import p000.pt1;
import p000.tt1;
import p000.y42;
import p000.zi4;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f16224b = 0;

    /* JADX INFO: renamed from: a */
    public int f16225a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f16225a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                tt1 tt1VarM11134e = tt1.m11134e(this);
                if (i2 == -1) {
                    km5 km5Var = tt1VarM11134e.f31423m;
                    km5Var.sendMessage(km5Var.obtainMessage(3));
                } else if (i2 == 0) {
                    tt1VarM11134e.m11138f(new lk0(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f16225a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f16225a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f16225a = bundle.getInt("resolution");
        }
        if (this.f16225a == 1) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            y42.m12854a0(num);
            pt1.f27970d.m9665c(this, num.intValue(), this);
            this.f16225a = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f16225a = 1;
            } catch (ActivityNotFoundException e) {
                e = e;
                ActivityNotFoundException activityNotFoundException = e;
                if (extras.getBoolean("notify_manager", true)) {
                    tt1.m11134e(googleApiActivity).m11138f(new lk0(22, null, null), googleApiActivity.getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strM13621u = zi4.m13621u("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strM13621u = strM13621u.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", strM13621u, activityNotFoundException);
                }
                googleApiActivity.f16225a = 1;
                googleApiActivity.finish();
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                googleApiActivity.finish();
            }
        } catch (ActivityNotFoundException e3) {
            e = e3;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e4) {
            e = e4;
            googleApiActivity = this;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f16225a);
        super.onSaveInstanceState(bundle);
    }
}
