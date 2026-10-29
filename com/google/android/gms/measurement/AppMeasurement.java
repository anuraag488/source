package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.bv5;
import p000.mg6;
import p000.mz5;
import p000.oa6;
import p000.og6;
import p000.qr5;
import p000.qu5;
import p000.tm5;
import p000.y42;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b */
    public static volatile AppMeasurement f16253b;

    /* JADX INFO: renamed from: a */
    public bv5 f16254a;

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f16253b == null) {
            synchronized (AppMeasurement.class) {
                if (f16253b == null) {
                    og6 og6Var = (og6) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (og6Var != null) {
                        AppMeasurement appMeasurement = new AppMeasurement();
                        qr5 qr5Var = new qr5();
                        qr5Var.f28730a = og6Var;
                        VarHandle.storeStoreFence();
                        appMeasurement.f16254a = qr5Var;
                        VarHandle.storeStoreFence();
                        f16253b = appMeasurement;
                    } else {
                        oa6 oa6VarM9017q = oa6.m9017q(context, new mz5(0L, 0L, true, null, null), null);
                        AppMeasurement appMeasurement2 = new AppMeasurement();
                        tm5 tm5Var = new tm5();
                        y42.m12854a0(oa6VarM9017q);
                        tm5Var.f31241a = oa6VarM9017q;
                        mg6 mg6Var = oa6VarM9017q.f26521m;
                        oa6.m9015k(mg6Var);
                        tm5Var.f31242b = mg6Var;
                        VarHandle.storeStoreFence();
                        appMeasurement2.f16254a = tm5Var;
                        VarHandle.storeStoreFence();
                        f16253b = appMeasurement2;
                    }
                }
            }
        }
        return f16253b;
    }

    public void beginAdUnitExposure(String str) {
        this.f16254a.mo9075m(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f16254a.mo9065c(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.f16254a.mo9072j(str);
    }

    public long generateEventId() {
        return this.f16254a.mo9064b();
    }

    public String getAppInstanceId() {
        return this.f16254a.mo9071i();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listMo9068f = this.f16254a.mo9068f(str, str2);
        ArrayList arrayList = new ArrayList(listMo9068f == null ? 0 : listMo9068f.size());
        for (Bundle bundle : listMo9068f) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            y42.m12854a0(bundle);
            conditionalUserProperty.mAppId = (String) qu5.m10127c(bundle, "app_id", String.class, null);
            conditionalUserProperty.mOrigin = (String) qu5.m10127c(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) qu5.m10127c(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = qu5.m10127c(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) qu5.m10127c(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) qu5.m10127c(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) qu5.m10127c(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) qu5.m10127c(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) qu5.m10127c(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) qu5.m10127c(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) qu5.m10127c(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) qu5.m10127c(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) qu5.m10127c(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) qu5.m10127c(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) qu5.m10127c(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) qu5.m10127c(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.f16254a.mo9067e();
    }

    public String getCurrentScreenName() {
        return this.f16254a.mo9066d();
    }

    public String getGmpAppId() {
        return this.f16254a.mo9073k();
    }

    public int getMaxUserProperties(String str) {
        return this.f16254a.mo9070h(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f16254a.mo9074l(str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f16254a.mo9063a(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        y42.m12854a0(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            qu5.m10126b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bv5 bv5Var = this.f16254a;
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        bv5Var.mo9069g(bundle);
    }
}
