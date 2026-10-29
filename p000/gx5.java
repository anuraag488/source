package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface gx5 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(qx5 qx5Var);

    void getAppInstanceId(qx5 qx5Var);

    void getCachedAppInstanceId(qx5 qx5Var);

    void getConditionalUserProperties(String str, String str2, qx5 qx5Var);

    void getCurrentScreenClass(qx5 qx5Var);

    void getCurrentScreenName(qx5 qx5Var);

    void getGmpAppId(qx5 qx5Var);

    void getMaxUserProperties(String str, qx5 qx5Var);

    void getSessionId(qx5 qx5Var);

    void getTestFlag(qx5 qx5Var, int i);

    void getUserProperties(String str, String str2, boolean z, qx5 qx5Var);

    void initForTests(Map map);

    void initialize(a02 a02Var, mz5 mz5Var, long j);

    void isDataCollectionEnabled(qx5 qx5Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, qx5 qx5Var, long j);

    void logHealthData(int i, String str, a02 a02Var, a02 a02Var2, a02 a02Var3);

    void onActivityCreated(a02 a02Var, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(pz5 pz5Var, Bundle bundle, long j);

    void onActivityDestroyed(a02 a02Var, long j);

    void onActivityDestroyedByScionActivityInfo(pz5 pz5Var, long j);

    void onActivityPaused(a02 a02Var, long j);

    void onActivityPausedByScionActivityInfo(pz5 pz5Var, long j);

    void onActivityResumed(a02 a02Var, long j);

    void onActivityResumedByScionActivityInfo(pz5 pz5Var, long j);

    void onActivitySaveInstanceState(a02 a02Var, qx5 qx5Var, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(pz5 pz5Var, qx5 qx5Var, long j);

    void onActivityStarted(a02 a02Var, long j);

    void onActivityStartedByScionActivityInfo(pz5 pz5Var, long j);

    void onActivityStopped(a02 a02Var, long j);

    void onActivityStoppedByScionActivityInfo(pz5 pz5Var, long j);

    void performAction(Bundle bundle, qx5 qx5Var, long j);

    void registerOnMeasurementEventListener(az5 az5Var);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(dy5 dy5Var);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(a02 a02Var, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(pz5 pz5Var, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(az5 az5Var);

    void setInstanceIdProvider(iz5 iz5Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, a02 a02Var, boolean z, long j);

    void unregisterOnMeasurementEventListener(az5 az5Var);
}
