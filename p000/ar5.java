package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ar5 extends rl6 {

    /* JADX INFO: renamed from: h */
    public wq5 f14825h;

    /* JADX INFO: renamed from: i */
    public al6 f14826i;

    /* JADX INFO: renamed from: j */
    public static final String[] f14817j = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: k */
    public static final String[] f14818k = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: l */
    public static final String[] f14819l = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: m */
    public static final String[] f14820m = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};

    /* JADX INFO: renamed from: n */
    public static final String[] f14821n = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: o */
    public static final String[] f14822o = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: p */
    public static final String[] f14823p = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: q */
    public static final String[] f14824q = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: L */
    public static final String[] f14814L = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: M */
    public static final String[] f14815M = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: N */
    public static final String[] f14816N = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: Z */
    public static final String m3156Z(List list) {
        return list.isEmpty() ? "" : zi4.m13621u(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m3157h0(ContentValues contentValues, Object obj) {
        y42.m12851X("value");
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            C1077qn.m9987m("Invalid value type");
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m3158A(String str) {
        ch6[] ch6VarArr = {ch6.f16033c};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(ch6VarArr[0].f16039a));
        String strM3156Z = m3156Z(arrayList);
        String strM3186Y = m3186Y();
        return m3178Q(c75.m3882n(new StringBuilder((strM3156Z.length() + 61) + strM3186Y.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strM3156Z, " AND NOT ", strM3186Y), new String[]{str}) != 0;
    }

    /* JADX INFO: renamed from: A0 */
    public final oq5 m3159A0(long j, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return m3161B0(j, str, 1L, false, false, z, false, z2, z3, z4);
    }

    /* JADX INFO: renamed from: B */
    public final void m3160B(Long l) {
        oa6 oa6Var = (oa6) this.f36084a;
        mo5038t();
        m10368u();
        try {
            if (m3197l0().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                d76 d76Var = oa6Var.f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16838m.m12504a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16835j.m12505b(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final oq5 m3161B0(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        oa6 oa6Var = (oa6) this.f36084a;
        y42.m12851X(str);
        mo5038t();
        m10368u();
        String[] strArr = {str};
        oq5 oq5Var = new oq5();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM3197l0 = m3197l0();
                cursorQuery = sQLiteDatabaseM3197l0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j) {
                        oq5Var.f26968b = cursorQuery.getLong(1);
                        oq5Var.f26967a = cursorQuery.getLong(2);
                        oq5Var.f26969c = cursorQuery.getLong(3);
                        oq5Var.f26970d = cursorQuery.getLong(4);
                        oq5Var.f26971e = cursorQuery.getLong(5);
                        oq5Var.f26972f = cursorQuery.getLong(6);
                        oq5Var.f26973g = cursorQuery.getLong(7);
                    }
                    if (z) {
                        oq5Var.f26968b += j2;
                    }
                    if (z2) {
                        oq5Var.f26967a += j2;
                    }
                    if (z3) {
                        oq5Var.f26969c += j2;
                    }
                    if (z4) {
                        oq5Var.f26970d += j2;
                    }
                    if (z5) {
                        oq5Var.f26971e += j2;
                    }
                    if (z6) {
                        oq5Var.f26972f += j2;
                    }
                    if (z7) {
                        oq5Var.f26973g += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(oq5Var.f26967a));
                    contentValues.put("daily_events_count", Long.valueOf(oq5Var.f26968b));
                    contentValues.put("daily_conversions_count", Long.valueOf(oq5Var.f26969c));
                    contentValues.put("daily_error_events_count", Long.valueOf(oq5Var.f26970d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(oq5Var.f26971e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(oq5Var.f26972f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(oq5Var.f26973g));
                    sQLiteDatabaseM3197l0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    d76 d76Var = oa6Var.f26514f;
                    oa6.m9016l(d76Var);
                    d76Var.f16838m.m12505b(d76.m4401y(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                d76 d76Var2 = oa6Var.f26514f;
                oa6.m9016l(d76Var2);
                d76Var2.f16835j.m12506c("Error updating daily counts. appId", d76.m4401y(str), e);
            }
            return oq5Var;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX INFO: renamed from: C */
    public final String m3162C() throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseM3197l0 = m3197l0();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseM3197l0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    d76 d76Var = ((oa6) this.f36084a).f26514f;
                    oa6.m9016l(d76Var);
                    d76Var.f16835j.m12505b(e, "Database error getting next bundle app id");
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursorRawQuery = null;
            } catch (Throwable th) {
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            r1 = sQLiteDatabaseM3197l0;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX INFO: renamed from: C0 */
    public final tt2 m3163C0(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        oa6 oa6Var = (oa6) this.f36084a;
        y42.m12851X(str);
        mo5038t();
        m10368u();
        ?? r2 = 0;
        try {
            try {
                cursorQuery = m3197l0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        boolean z = false;
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            d76 d76Var = oa6Var.f26514f;
                            oa6.m9016l(d76Var);
                            d76Var.f16835j.m12505b(d76.m4401y(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            tt2 tt2Var = new tt2((byte) 20, z);
                            tt2Var.f31428b = blob;
                            tt2Var.f31429c = string;
                            tt2Var.f31430d = string2;
                            VarHandle.storeStoreFence();
                            cursorQuery.close();
                            return tt2Var;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    d76 d76Var2 = oa6Var.f26514f;
                    oa6.m9016l(d76Var2);
                    d76Var2.f16835j.m12506c("Error querying remote config. appId", d76.m4401y(str), e);
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (r2 != 0) {
                    throw th;
                }
                r2.close();
                throw th;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            r2 = this;
            if (r2 != 0) {
                throw th;
            }
            r2.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m3164D(long j) {
        mo5038t();
        m10368u();
        try {
            if (m3197l0().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12505b(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m3165D0(ua6 ua6Var, boolean z) {
        mo5038t();
        m10368u();
        y42.m12851X(ua6Var.m11487o());
        if (!ua6Var.m11448a2()) {
            xy4.m12787p();
            return;
        }
        m3166E();
        oa6 oa6Var = (oa6) this.f36084a;
        ia5 ia5Var = oa6Var.f26519k;
        d76 d76Var = oa6Var.f26514f;
        ia5Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM11451b2 = ua6Var.m11451b2();
        d56 d56Var = e56.f17751R;
        if (jM11451b2 < jCurrentTimeMillis - ((Long) d56Var.m4379a(null)).longValue() || ua6Var.m11451b2() > ((Long) d56Var.m4379a(null)).longValue() + jCurrentTimeMillis) {
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12507d("Storing bundle outside of the max uploading time span. appId, now, timestamp", d76.m4401y(ua6Var.m11487o()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(ua6Var.m11451b2()));
        }
        byte[] bArrM5118a = ua6Var.m5118a();
        try {
            q76 q76Var = this.f19870f.f28597g;
            qm6.m9925S(q76Var);
            byte[] bArrM9797j0 = q76Var.m9797j0(bArrM5118a);
            oa6.m9016l(d76Var);
            d76Var.f16831L.m12505b(Integer.valueOf(bArrM9797j0.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", ua6Var.m11487o());
            contentValues.put("bundle_end_timestamp", Long.valueOf(ua6Var.m11451b2()));
            contentValues.put("data", bArrM9797j0);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (ua6Var.m11488o0()) {
                contentValues.put("retry_count", Integer.valueOf(ua6Var.m11491p0()));
            }
            try {
                if (m3197l0().insert("queue", null, contentValues) == -1) {
                    oa6.m9016l(d76Var);
                    d76Var.f16835j.m12505b(d76.m4401y(ua6Var.m11487o()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                oa6.m9016l(d76Var);
                d76Var.f16835j.m12506c("Error storing bundle. appId", d76.m4401y(ua6Var.m11487o()), e);
            }
        } catch (IOException e2) {
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12506c("Data loss. Failed to serialize bundle. appId", d76.m4401y(ua6Var.m11487o()), e2);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m3166E() {
        mo5038t();
        m10368u();
        if (m3192f0()) {
            qm6 qm6Var = this.f19870f;
            long jM8623a = qm6Var.f28599i.f29363i.m8623a();
            oa6 oa6Var = (oa6) this.f36084a;
            oa6Var.f26519k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jM8623a) > ((Long) e56.f17741M.m4379a(null)).longValue()) {
                qm6Var.f28599i.f29363i.m8624b(jElapsedRealtime);
                mo5038t();
                m10368u();
                if (m3192f0()) {
                    SQLiteDatabase sQLiteDatabaseM3197l0 = m3197l0();
                    oa6Var.f26519k.getClass();
                    int iDelete = sQLiteDatabaseM3197l0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) e56.f17751R.m4379a(null)).longValue())});
                    if (iDelete > 0) {
                        d76 d76Var = oa6Var.f26514f;
                        oa6.m9016l(d76Var);
                        d76Var.f16831L.m12505b(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m3167F(ArrayList arrayList) {
        oa6 oa6Var = (oa6) this.f36084a;
        mo5038t();
        m10368u();
        y42.m12854a0(arrayList);
        if (arrayList.size() == 0) {
            C1077qn.m9987m("Given Integer is zero");
            return;
        }
        if (m3192f0()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strM3881m = c75.m3881m(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (m3178Q(c75.m3881m(new StringBuilder(strM3881m.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strM3881m, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                d76 d76Var = oa6Var.f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16838m.m12504a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseM3197l0 = m3197l0();
                StringBuilder sb = new StringBuilder(strM3881m.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(strM3881m);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseM3197l0.execSQL(sb.toString());
            } catch (SQLiteException e) {
                d76 d76Var2 = oa6Var.f26514f;
                oa6.m9016l(d76Var2);
                d76Var2.f16835j.m12505b(e, "Error incrementing retry count. error");
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m3168G(Long l) {
        oa6 oa6Var = (oa6) this.f36084a;
        mo5038t();
        m10368u();
        if (m3192f0()) {
            StringBuilder sb = new StringBuilder(l.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m3178Q(sb.toString(), null) > 0) {
                d76 d76Var = oa6Var.f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16838m.m12504a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseM3197l0 = m3197l0();
                oa6Var.f26519k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(jCurrentTimeMillis);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 34 + l.toString().length() + 29);
                sb3.append("UPDATE upload_queue");
                sb3.append(string);
                sb3.append(" WHERE rowid = ");
                sb3.append(l);
                sb3.append(" AND retry_count < 2147483647");
                sQLiteDatabaseM3197l0.execSQL(sb3.toString());
            } catch (SQLiteException e) {
                d76 d76Var2 = oa6Var.f26514f;
                oa6.m9016l(d76Var2);
                d76Var2.f16835j.m12505b(e, "Error incrementing retry count. error");
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final Object m3169H(Cursor cursor, int i) {
        oa6 oa6Var = (oa6) this.f36084a;
        int type = cursor.getType(i);
        if (type == 0) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12504a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16835j.m12505b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        d76 d76Var3 = oa6Var.f26514f;
        oa6.m9016l(d76Var3);
        d76Var3.f16835j.m12504a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX INFO: renamed from: I */
    public final long m3170I(String str) {
        long j;
        ContentValues contentValues;
        oa6 oa6Var = (oa6) this.f36084a;
        y42.m12851X(str);
        y42.m12851X("first_open_count");
        mo5038t();
        m10368u();
        SQLiteDatabase sQLiteDatabaseM3197l0 = m3197l0();
        sQLiteDatabaseM3197l0.beginTransaction();
        long j2 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j = -1;
                long jM3179R = m3179R(sb.toString(), new String[]{str}, -1L);
                if (jM3179R == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseM3197l0.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        d76 d76Var = oa6Var.f26514f;
                        oa6.m9016l(d76Var);
                        d76Var.f16835j.m12506c("Failed to insert column (got -1). appId", d76.m4401y(str), "first_open_count");
                    } else {
                        jM3179R = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jM3179R));
                            if (sQLiteDatabaseM3197l0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                d76 d76Var2 = oa6Var.f26514f;
                                oa6.m9016l(d76Var2);
                                d76Var2.f16835j.m12506c("Failed to update column (got 0). appId", d76.m4401y(str), "first_open_count");
                            } else {
                                sQLiteDatabaseM3197l0.setTransactionSuccessful();
                                j = jM3179R;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            j2 = jM3179R;
                            d76 d76Var3 = oa6Var.f26514f;
                            oa6.m9016l(d76Var3);
                            d76Var3.f16835j.m12507d("Error inserting column. appId", d76.m4401y(str), "first_open_count", e);
                            j = j2;
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jM3179R));
                    if (sQLiteDatabaseM3197l0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        d76 d76Var4 = oa6Var.f26514f;
                        oa6.m9016l(d76Var4);
                        d76Var4.f16835j.m12506c("Failed to update column (got 0). appId", d76.m4401y(str), "first_open_count");
                    } else {
                        sQLiteDatabaseM3197l0.setTransactionSuccessful();
                        j = jM3179R;
                    }
                }
            } finally {
                sQLiteDatabaseM3197l0.endTransaction();
            }
        } catch (SQLiteException e2) {
            e = e2;
        }
        return j;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m3171J(String str, String str2) {
        return m3178Q("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    /* JADX INFO: renamed from: K */
    public final void m3172K(List list) {
        y42.m12854a0(list);
        mo5038t();
        m10368u();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i)).longValue());
        }
        sb.append(")");
        int iDelete = m3197l0().delete("raw_events", sb.toString(), null);
        if (iDelete != list.size()) {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12506c("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list.size()));
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m3173L(String str) {
        try {
            m3197l0().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{str, str});
        } catch (SQLiteException e) {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12506c("Failed to remove unused event metadata. appId", d76.m4401y(str), e);
        }
    }

    /* JADX INFO: renamed from: M */
    public final long m3174M(String str) {
        y42.m12851X(str);
        return m3179R("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: renamed from: N */
    public final void m3175N(String str, Long l, long j, m96 m96Var) {
        mo5038t();
        m10368u();
        y42.m12854a0(m96Var);
        y42.m12851X(str);
        oa6 oa6Var = (oa6) this.f36084a;
        byte[] bArrM5118a = m96Var.m5118a();
        d76 d76Var = oa6Var.f26514f;
        d76 d76Var2 = oa6Var.f26514f;
        oa6.m9016l(d76Var);
        d76Var.f16831L.m12506c("Saving complex main event, appId, data size", oa6Var.f26518j.m9366a(str), Integer.valueOf(bArrM5118a.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrM5118a);
        try {
            if (m3197l0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                oa6.m9016l(d76Var2);
                d76Var2.f16835j.m12505b(d76.m4401y(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            oa6.m9016l(d76Var2);
            d76Var2.f16835j.m12506c("Error storing complex main event. appId", d76.m4401y(str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:2: B:51:0x0125->B:127:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x012b  */
    /* JADX INFO: renamed from: O */
    public final void m3176O(String str, Long l, String str2, Bundle bundle) throws Throwable {
        dp2 dp2Var;
        d76 d76Var;
        Bundle bundle2;
        cs5 cs5Var;
        long j;
        String str3;
        ContentValues contentValues;
        d76 d76Var2;
        ua6 ua6Var;
        Iterator it;
        String str4 = str;
        oa6 oa6Var = (oa6) this.f36084a;
        y42.m12854a0(bundle);
        mo5038t();
        m10368u();
        if (l != null) {
            long jLongValue = l.longValue();
            dp2Var = new dp2();
            dp2Var.f17256c = this;
            y42.m12851X(str4);
            dp2Var.f17255b = str4;
            dp2Var.f17254a = m3179R("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str4, String.valueOf(jLongValue)}, -1L);
            VarHandle.storeStoreFence();
        } else {
            dp2Var = new dp2();
            dp2Var.f17256c = this;
            y42.m12851X(str4);
            dp2Var.f17255b = str4;
            dp2Var.f17254a = -1L;
            VarHandle.storeStoreFence();
        }
        dp2 dp2Var2 = dp2Var;
        List<qq5> listM4636b = dp2Var2.m4636b();
        while (!listM4636b.isEmpty()) {
            for (qq5 qq5Var : listM4636b) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        ua6 ua6Var2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = m3197l0().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(qq5Var.f28700b)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                ua6Var = (ua6) ((qa6) q76.m9777k0(ua6.m11368T(), cursorQuery.getBlob(0))).m11056e();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        d76 d76Var3 = oa6Var.f26514f;
                                                        oa6.m9016l(d76Var3);
                                                        d76Var3.f16838m.m12505b(d76.m4401y(str4), "Get multiple raw event metadata records, expected one. appId");
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e) {
                                                    e = e;
                                                    cursor = cursorQuery;
                                                    d76 d76Var4 = oa6Var.f26514f;
                                                    oa6.m9016l(d76Var4);
                                                    d76Var4.f16835j.m12506c("Data loss. Error selecting raw event. appId", d76.m4401y(str4), e);
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                }
                                                ua6Var2 = ua6Var;
                                            } catch (IOException e2) {
                                                d76 d76Var5 = oa6Var.f26514f;
                                                oa6.m9016l(d76Var5);
                                                d76Var5.f16835j.m12506c("Data loss. Failed to merge raw event metadata. appId", d76.m4401y(str4), e2);
                                                cursorQuery.close();
                                            }
                                            if (ua6Var2 != null) {
                                                it = ua6Var2.m11428T1().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((pb6) it.next()).m9482q().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            d76 d76Var6 = oa6Var.f26514f;
                                            oa6.m9016l(d76Var6);
                                            d76Var6.f16835j.m12505b(d76.m4401y(str4), "Raw event metadata record is missing. appId");
                                        }
                                        cursorQuery.close();
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor2 = cursorQuery;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    ua6Var = null;
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                ua6Var = null;
                            }
                            if (ua6Var2 != null) {
                                it = ua6Var2.m11428T1().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((pb6) it.next()).m9482q().equals(str2)) {
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    long jUpdate = m3197l0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
                    if (jUpdate != 1) {
                        oa6.m9016l(d76Var);
                        d76Var2 = d76Var;
                        try {
                            d76Var2.f16835j.m12506c("Failed to update raw event. appId, updatedRows", d76.m4401y(str3), Long.valueOf(jUpdate));
                        } catch (SQLiteException e5) {
                            e = e5;
                            oa6.m9016l(d76Var2);
                            d76Var2.f16835j.m12506c("Error updating raw event. appId", d76.m4401y(cs5Var.f16432a), e);
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    d76Var2 = d76Var;
                }
                qm6 qm6Var = this.f19870f;
                q76 q76Var = qm6Var.f28597g;
                qm6.m9925S(q76Var);
                m96 m96Var = qq5Var.f28702d;
                Bundle bundle3 = new Bundle();
                for (x96 x96Var : m96Var.m8244o()) {
                    if (x96Var.m12554w()) {
                        bundle3.putDouble(x96Var.m12547p(), x96Var.m12555x());
                    } else if (x96Var.m12552u()) {
                        bundle3.putFloat(x96Var.m12547p(), x96Var.m12553v());
                    } else if (x96Var.m12550s()) {
                        bundle3.putLong(x96Var.m12547p(), x96Var.m12551t());
                    } else if (x96Var.m12548q()) {
                        bundle3.putString(x96Var.m12547p(), x96Var.m12549r());
                    } else if (x96Var.m12556y().isEmpty()) {
                        d76 d76Var7 = ((oa6) q76Var.f36084a).f26514f;
                        oa6.m9016l(d76Var7);
                        d76Var7.f16835j.m12505b(x96Var, "Unexpected parameter type for parameter");
                    } else {
                        bundle3.putParcelableArray(x96Var.m12547p(), q76.m9779m0((mi6) x96Var.m12556y()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strM8247r = m96Var.m8247r();
                if (string == null) {
                    string = "";
                }
                dn6 dn6Var = oa6Var.f26517i;
                d76Var = oa6Var.f26514f;
                oa6.m9014j(dn6Var);
                if (strM8247r.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        m96 m96Var2 = m96Var;
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                        m96Var = m96Var2;
                    }
                } else {
                    bundle2 = bundle;
                }
                m96 m96Var3 = m96Var;
                dn6Var.m4587F(bundle3, bundle2);
                cs5Var = new cs5((oa6) this.f36084a, string, str4, m96Var3.m8247r(), m96Var3.m8249t(), m96Var3.m8251v(), bundle3);
                j = qq5Var.f28699a;
                long j2 = qq5Var.f28700b;
                boolean z = qq5Var.f28701c;
                mo5038t();
                m10368u();
                str3 = cs5Var.f16432a;
                y42.m12851X(str3);
                q76 q76Var2 = qm6Var.f28597g;
                qm6.m9925S(q76Var2);
                byte[] bArrM5118a = q76Var2.m9790Z(cs5Var).m5118a();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", cs5Var.f16433b);
                contentValues.put("timestamp", Long.valueOf(cs5Var.f16435d));
                contentValues.put("metadata_fingerprint", Long.valueOf(j2));
                contentValues.put("data", bArrM5118a);
                contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
                str4 = str;
            }
            listM4636b = dp2Var2.m4636b();
            str4 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v0, types: [ar5, rl6, zh0] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    /* JADX INFO: renamed from: P */
    public final xc6 m3177P(String str) throws Throwable {
        Throwable th;
        SQLiteException e;
        oa6 oa6Var = (oa6) this.f36084a;
        y42.m12854a0(str);
        mo5038t();
        m10368u();
        ?? r2 = 0;
        xc6VarM12653c = null;
        xc6VarM12653c = null;
        xc6 xc6VarM12653c = null;
        try {
            try {
                this = m3197l0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
                try {
                    if (this.moveToFirst()) {
                        xc6VarM12653c = xc6.m12653c(this.getInt(1), this.getString(0));
                    } else {
                        d76 d76Var = oa6Var.f26514f;
                        oa6.m9016l(d76Var);
                        d76Var.f16831L.m12504a("No data found");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    d76 d76Var2 = oa6Var.f26514f;
                    oa6.m9016l(d76Var2);
                    d76Var2.f16835j.m12505b(e, "Error querying database.");
                    if (this != 0) {
                    }
                    if (xc6VarM12653c == null) {
                        return xc6.f34159c;
                    }
                    return xc6VarM12653c;
                }
            } catch (SQLiteException e3) {
                e = e3;
                this = 0;
            } catch (Throwable th2) {
                th = th2;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
            this.close();
            if (xc6VarM12653c == null) {
                return xc6.f34159c;
            }
            return xc6VarM12653c;
        } catch (Throwable th3) {
            th = th3;
            r2 = this;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final long m3178Q(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m3197l0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                d76 d76Var = ((oa6) this.f36084a).f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16835j.m12506c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: R */
    public final long m3179R(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m3197l0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                d76 d76Var = ((oa6) this.f36084a).f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16835j.m12506c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX INFO: renamed from: S */
    public final String m3180S(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m3197l0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                d76 d76Var = ((oa6) this.f36084a).f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16835j.m12506c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    /* JADX INFO: renamed from: T */
    public final void m3181T(ContentValues contentValues) {
        oa6 oa6Var = (oa6) this.f36084a;
        try {
            SQLiteDatabase sQLiteDatabaseM3197l0 = m3197l0();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                d76 d76Var = oa6Var.f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16837l.m12505b(d76.m4401y("app_id"), "Value of the primary key is not set.");
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id = ?");
            if (sQLiteDatabaseM3197l0.update("consent_settings", contentValues, sb.toString(), new String[]{asString}) == 0 && sQLiteDatabaseM3197l0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                d76 d76Var2 = oa6Var.f26514f;
                oa6.m9016l(d76Var2);
                d76Var2.f16835j.m12506c("Failed to insert/update table (got -1). key", d76.m4401y("consent_settings"), d76.m4401y("app_id"));
            }
        } catch (SQLiteException e) {
            d76 d76Var3 = oa6Var.f26514f;
            oa6.m9016l(d76Var3);
            d76Var3.f16835j.m12507d("Error storing into table. key", d76.m4401y("consent_settings"), d76.m4401y("app_id"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX INFO: renamed from: U */
    public final fs5 m3182U(String str, String str2, String str3) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        oa6 oa6Var = (oa6) this.f36084a;
        y42.m12851X(str2);
        y42.m12851X(str3);
        mo5038t();
        m10368u();
        ArrayList arrayList = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
        ?? r3 = 0;
        try {
            try {
                cursorQuery = m3197l0().query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(1);
                        long j3 = cursorQuery.getLong(2);
                        long j4 = 0;
                        long j5 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        if (!cursorQuery.isNull(8)) {
                            j4 = cursorQuery.getLong(8);
                        }
                        fs5 fs5Var = new fs5(str2, str3, j, j2, j4, j3, j5, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            d76 d76Var = oa6Var.f26514f;
                            oa6.m9016l(d76Var);
                            d76Var.f16835j.m12505b(d76.m4401y(str2), "Got multiple records for event aggregates, expected one. appId");
                        }
                        cursorQuery.close();
                        return fs5Var;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    d76 d76Var2 = oa6Var.f26514f;
                    oa6.m9016l(d76Var2);
                    d76Var2.f16835j.m12507d("Error querying events. appId", d76.m4401y(str2), oa6Var.f26518j.m9366a(str3), e);
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            r3 = arrayList;
            if (r3 != 0) {
                r3.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m3183V(String str, fs5 fs5Var) {
        oa6 oa6Var = (oa6) this.f36084a;
        y42.m12854a0(fs5Var);
        mo5038t();
        m10368u();
        ContentValues contentValues = new ContentValues();
        String str2 = fs5Var.f19254a;
        contentValues.put("app_id", str2);
        contentValues.put("name", fs5Var.f19255b);
        contentValues.put("lifetime_count", Long.valueOf(fs5Var.f19256c));
        contentValues.put("current_bundle_count", Long.valueOf(fs5Var.f19257d));
        contentValues.put("last_fire_timestamp", Long.valueOf(fs5Var.f19259f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(fs5Var.f19260g));
        contentValues.put("last_bundled_day", fs5Var.f19261h);
        contentValues.put("last_sampled_complex_event_id", fs5Var.f19262i);
        contentValues.put("last_sampling_rate", fs5Var.f19263j);
        contentValues.put("current_session_count", Long.valueOf(fs5Var.f19258e));
        Boolean bool = fs5Var.f19264k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m3197l0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                d76 d76Var = oa6Var.f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16835j.m12505b(d76.m4401y(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16835j.m12506c("Error storing event aggregates. appId", d76.m4401y(str2), e);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m3184W(String str, String str2) {
        y42.m12851X(str2);
        mo5038t();
        m10368u();
        try {
            m3197l0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12506c("Error deleting snapshot. appId", d76.m4401y(str2), e);
        }
    }

    /* JADX INFO: renamed from: X */
    public final um6 m3185X(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
        ch6 ch6Var;
        oa6 oa6Var = (oa6) this.f36084a;
        if (TextUtils.isEmpty(str2)) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16842q.m12504a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            fa6 fa6Var = (fa6) q76.m9777k0(pa6.m9446v(), bArr);
            ch6[] ch6VarArrValues = ch6.values();
            int length = ch6VarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    ch6Var = ch6.f16037g;
                    break;
                }
                ch6Var = ch6VarArrValues[i3];
                if (ch6Var.f16039a == i) {
                    break;
                }
                i3++;
            }
            if (ch6Var != ch6.f16033c && ch6Var != ch6.f16036f && i2 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((pa6) fa6Var.f31181b).m9452o()).iterator();
                while (it.hasNext()) {
                    qa6 qa6Var = (qa6) ((ua6) it.next()).m13569g();
                    qa6Var.m11054c();
                    ((ua6) qa6Var.f31181b).m11425S0(i2);
                    arrayList.add((ua6) qa6Var.m11056e());
                }
                fa6Var.m11054c();
                ((pa6) fa6Var.f31181b).m9448A();
                fa6Var.m11054c();
                ((pa6) fa6Var.f31181b).m9461z(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        d76 d76Var2 = oa6Var.f26514f;
                        oa6.m9016l(d76Var2);
                        d76Var2.f16835j.m12505b(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            pa6 pa6Var = (pa6) fa6Var.m11056e();
            um6 um6Var = new um6();
            um6Var.f31998a = j;
            um6Var.f31999b = pa6Var;
            um6Var.f32000c = str2;
            um6Var.f32001d = map;
            um6Var.f32002e = ch6Var;
            um6Var.f32003f = j2;
            um6Var.f32004g = j3;
            um6Var.f32005h = j4;
            um6Var.f32006i = i2;
            VarHandle.storeStoreFence();
            return um6Var;
        } catch (IOException e) {
            d76 d76Var3 = oa6Var.f26514f;
            oa6.m9016l(d76Var3);
            d76Var3.f16835j.m12506c("Failed to queued MeasurementBatch from upload_queue. appId", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: Y */
    public final String m3186Y() {
        ((oa6) this.f36084a).f26519k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l = (Long) e56.f17753S.m4379a(null);
        l.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l + ")";
        long jLongValue = ((Long) e56.f17751R.m4379a(null)).longValue();
        StringBuilder sb = new StringBuilder("(upload_type != 1 AND ABS(creation_timestamp - ");
        sb.append(jCurrentTimeMillis);
        sb.append(") > ");
        String strM4369n = d55.m4369n(sb, jLongValue, ")");
        StringBuilder sb2 = new StringBuilder(sk5.m10848n(str.length(), 5, strM4369n.length(), 1));
        zi4.m13599B(sb2, "(", str, " OR ", strM4369n);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m3187a0(String str, cl6 cl6Var) {
        mo5038t();
        m10368u();
        y42.m12851X(str);
        oa6 oa6Var = (oa6) this.f36084a;
        ia5 ia5Var = oa6Var.f26519k;
        d76 d76Var = oa6Var.f26514f;
        ia5Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        d56 d56Var = e56.f17822v0;
        long jLongValue = jCurrentTimeMillis - ((Long) d56Var.m4379a(null)).longValue();
        long j = cl6Var.f16115e;
        if (j < jLongValue || j > ((Long) d56Var.m4379a(null)).longValue() + jCurrentTimeMillis) {
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12507d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", d76.m4401y(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
        }
        oa6.m9016l(d76Var);
        d76Var.f16831L.m12504a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", cl6Var.f16114d);
        contentValues.put("source", Integer.valueOf(cl6Var.f16116f));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (m3197l0().insert("trigger_uris", null, contentValues) == -1) {
                oa6.m9016l(d76Var);
                d76Var.f16835j.m12505b(d76.m4401y(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12506c("Error storing trigger URI. appId", d76.m4401y(str), e);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m3188b0(String str, xc6 xc6Var) {
        y42.m12854a0(str);
        y42.m12854a0(xc6Var);
        mo5038t();
        m10368u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", xc6Var.m12659g());
        contentValues.put("consent_source", Integer.valueOf(xc6Var.f34161b));
        m3181T(contentValues);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m3189c0(String str, xc6 xc6Var) {
        y42.m12854a0(str);
        mo5038t();
        m10368u();
        m3188b0(str, m3177P(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", xc6Var.m12659g());
        m3181T(contentValues);
    }

    /* JADX INFO: renamed from: d0 */
    public final xc6 m3190d0(String str) {
        y42.m12854a0(str);
        mo5038t();
        m10368u();
        return xc6.m12653c(100, m3180S("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    /* JADX INFO: renamed from: e0 */
    public final fs5 m3191e0(String str, m96 m96Var, String str2) throws Throwable {
        fs5 fs5VarM3182U = m3182U("events", str, m96Var.m8247r());
        if (fs5VarM3182U != null) {
            long j = fs5VarM3182U.f19258e + 1;
            long j2 = fs5VarM3182U.f19257d + 1;
            return new fs5(fs5VarM3182U.f19254a, fs5VarM3182U.f19255b, fs5VarM3182U.f19256c + 1, j2, j, fs5VarM3182U.f19259f, fs5VarM3182U.f19260g, fs5VarM3182U.f19261h, fs5VarM3182U.f19262i, fs5VarM3182U.f19263j, fs5VarM3182U.f19264k);
        }
        oa6 oa6Var = (oa6) this.f36084a;
        d76 d76Var = oa6Var.f26514f;
        oa6.m9016l(d76Var);
        d76Var.f16838m.m12506c("Event aggregate wasn't created during raw event logging. appId, event", d76.m4401y(str), oa6Var.f26518j.m9366a(str2));
        return new fs5(str, m96Var.m8247r(), 1L, 1L, 1L, m96Var.m8249t(), 0L, null, null, null, null);
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m3192f0() {
        return ((oa6) this.f36084a).f26509a.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ea A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #4 {all -> 0x007a, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00cb, B:42:0x00ea, B:43:0x00fc, B:44:0x0100, B:45:0x0110, B:47:0x0116, B:48:0x0126, B:50:0x012f, B:53:0x0143, B:55:0x0161, B:56:0x016a, B:57:0x0174, B:62:0x01af, B:61:0x019f, B:65:0x01b6, B:52:0x013c, B:67:0x01c8, B:71:0x01db, B:11:0x003d, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:78:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fc A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TRY_LEAVE, TryCatch #4 {all -> 0x007a, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00cb, B:42:0x00ea, B:43:0x00fc, B:44:0x0100, B:45:0x0110, B:47:0x0116, B:48:0x0126, B:50:0x012f, B:53:0x0143, B:55:0x0161, B:56:0x016a, B:57:0x0174, B:62:0x01af, B:61:0x019f, B:65:0x01b6, B:52:0x013c, B:67:0x01c8, B:71:0x01db, B:11:0x003d, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:78:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0116 A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #4 {all -> 0x007a, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00cb, B:42:0x00ea, B:43:0x00fc, B:44:0x0100, B:45:0x0110, B:47:0x0116, B:48:0x0126, B:50:0x012f, B:53:0x0143, B:55:0x0161, B:56:0x016a, B:57:0x0174, B:62:0x01af, B:61:0x019f, B:65:0x01b6, B:52:0x013c, B:67:0x01c8, B:71:0x01db, B:11:0x003d, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:78:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x012f A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #4 {all -> 0x007a, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00cb, B:42:0x00ea, B:43:0x00fc, B:44:0x0100, B:45:0x0110, B:47:0x0116, B:48:0x0126, B:50:0x012f, B:53:0x0143, B:55:0x0161, B:56:0x016a, B:57:0x0174, B:62:0x01af, B:61:0x019f, B:65:0x01b6, B:52:0x013c, B:67:0x01c8, B:71:0x01db, B:11:0x003d, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:78:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x013c A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #4 {all -> 0x007a, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00cb, B:42:0x00ea, B:43:0x00fc, B:44:0x0100, B:45:0x0110, B:47:0x0116, B:48:0x0126, B:50:0x012f, B:53:0x0143, B:55:0x0161, B:56:0x016a, B:57:0x0174, B:62:0x01af, B:61:0x019f, B:65:0x01b6, B:52:0x013c, B:67:0x01c8, B:71:0x01db, B:11:0x003d, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:78:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0161 A[Catch: all -> 0x007a, SQLiteException -> 0x007d, LOOP:0: B:55:0x0161->B:90:?, LOOP_START, TRY_LEAVE, TryCatch #4 {all -> 0x007a, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00cb, B:42:0x00ea, B:43:0x00fc, B:44:0x0100, B:45:0x0110, B:47:0x0116, B:48:0x0126, B:50:0x012f, B:53:0x0143, B:55:0x0161, B:56:0x016a, B:57:0x0174, B:62:0x01af, B:61:0x019f, B:65:0x01b6, B:52:0x013c, B:67:0x01c8, B:71:0x01db, B:11:0x003d, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:78:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01af A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #4 {all -> 0x007a, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00cb, B:42:0x00ea, B:43:0x00fc, B:44:0x0100, B:45:0x0110, B:47:0x0116, B:48:0x0126, B:50:0x012f, B:53:0x0143, B:55:0x0161, B:56:0x016a, B:57:0x0174, B:62:0x01af, B:61:0x019f, B:65:0x01b6, B:52:0x013c, B:67:0x01c8, B:71:0x01db, B:11:0x003d, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:78:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01b6 A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #4 {all -> 0x007a, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00cb, B:42:0x00ea, B:43:0x00fc, B:44:0x0100, B:45:0x0110, B:47:0x0116, B:48:0x0126, B:50:0x012f, B:53:0x0143, B:55:0x0161, B:56:0x016a, B:57:0x0174, B:62:0x01af, B:61:0x019f, B:65:0x01b6, B:52:0x013c, B:67:0x01c8, B:71:0x01db, B:11:0x003d, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:78:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x019d A[SYNTHETIC] */
    /* JADX INFO: renamed from: g0 */
    public final void m3193g0(String str, long j, long j2, p86 p86Var) {
        String string;
        String[] strArr;
        String str2;
        String string2;
        String str3;
        String[] strArr2;
        long j3;
        l96 l96Var;
        oa6 oa6Var = (oa6) this.f36084a;
        mo5038t();
        m10368u();
        String str4 = "select app_id, metadata_fingerprint from raw_events where ";
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM3197l0 = m3197l0();
                if (TextUtils.isEmpty(str)) {
                    String[] strArr3 = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
                    str2 = j2 != -1 ? "rowid <= ? and " : "";
                    StringBuilder sb = new StringBuilder(str2.length() + 148);
                    sb.append("select app_id, metadata_fingerprint from raw_events where ");
                    sb.append(str2);
                    sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    cursorRawQuery = sQLiteDatabaseM3197l0.rawQuery(sb.toString(), strArr3);
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            string = cursorRawQuery.getString(0);
                            try {
                                string2 = cursorRawQuery.getString(1);
                                cursorRawQuery.close();
                                cursorRawQuery = sQLiteDatabaseM3197l0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string, string2}, null, null, "rowid", "2");
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        ua6 ua6Var = (ua6) ((qa6) q76.m9777k0(ua6.m11368T(), cursorRawQuery.getBlob(0))).m11056e();
                                        if (cursorRawQuery.moveToNext()) {
                                            d76 d76Var = oa6Var.f26514f;
                                            oa6.m9016l(d76Var);
                                            d76Var.f16838m.m12505b(d76.m4401y(string), "Get multiple raw event metadata records, expected one. appId");
                                        }
                                        cursorRawQuery.close();
                                        p86Var.f27459b = ua6Var;
                                        if (j2 != -1) {
                                            str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            strArr2 = new String[]{string, string2, String.valueOf(j2)};
                                        } else {
                                            str3 = "app_id = ? and metadata_fingerprint = ?";
                                            strArr2 = new String[]{string, string2};
                                        }
                                        cursorRawQuery = sQLiteDatabaseM3197l0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str3, strArr2, null, null, "rowid", null);
                                        if (cursorRawQuery.moveToFirst()) {
                                            do {
                                                j3 = cursorRawQuery.getLong(0);
                                                try {
                                                    l96Var = (l96) q76.m9777k0(m96.m8235y(), cursorRawQuery.getBlob(3));
                                                    String string3 = cursorRawQuery.getString(1);
                                                    l96Var.m11054c();
                                                    ((m96) l96Var.f31181b).m8240E(string3);
                                                    long j4 = cursorRawQuery.getLong(2);
                                                    l96Var.m11054c();
                                                    ((m96) l96Var.f31181b).m8241F(j4);
                                                    if (!p86Var.m9437a(j3, (m96) l96Var.m11056e())) {
                                                        break;
                                                    }
                                                } catch (IOException e) {
                                                    d76 d76Var2 = oa6Var.f26514f;
                                                    oa6.m9016l(d76Var2);
                                                    d76Var2.f16835j.m12506c("Data loss. Failed to merge raw event. appId", d76.m4401y(string), e);
                                                }
                                            } while (cursorRawQuery.moveToNext());
                                        } else {
                                            d76 d76Var3 = oa6Var.f26514f;
                                            oa6.m9016l(d76Var3);
                                            d76Var3.f16838m.m12505b(d76.m4401y(string), "Raw event data disappeared while in transaction. appId");
                                        }
                                    } catch (IOException e2) {
                                        d76 d76Var4 = oa6Var.f26514f;
                                        oa6.m9016l(d76Var4);
                                        d76Var4.f16835j.m12506c("Data loss. Failed to merge raw event metadata. appId", d76.m4401y(string), e2);
                                    }
                                } else {
                                    d76 d76Var5 = oa6Var.f26514f;
                                    oa6.m9016l(d76Var5);
                                    d76Var5.f16835j.m12505b(d76.m4401y(string), "Raw event metadata record is missing. appId");
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                d76 d76Var6 = oa6Var.f26514f;
                                oa6.m9016l(d76Var6);
                                d76Var6.f16835j.m12506c("Data loss. Error selecting raw event. appId", d76.m4401y(string), e);
                            }
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        string = str;
                    }
                } else {
                    try {
                        if (j2 != -1) {
                            str4 = str;
                            strArr = new String[]{str4, String.valueOf(j2)};
                        } else {
                            str4 = str;
                            strArr = new String[]{str4};
                        }
                        str2 = j2 != -1 ? " and rowid <= ?" : "";
                        StringBuilder sb2 = new StringBuilder(str2.length() + 84);
                        sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb2.append(str2);
                        sb2.append(" order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseM3197l0.rawQuery(sb2.toString(), strArr);
                        if (cursorRawQuery.moveToFirst()) {
                            string2 = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                            string = str4;
                            cursorRawQuery = sQLiteDatabaseM3197l0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string, string2}, null, null, "rowid", "2");
                            if (cursorRawQuery.moveToFirst()) {
                                d76 d76Var7 = oa6Var.f26514f;
                                oa6.m9016l(d76Var7);
                                d76Var7.f16835j.m12505b(d76.m4401y(string), "Raw event metadata record is missing. appId");
                            } else {
                                ua6 ua6Var2 = (ua6) ((qa6) q76.m9777k0(ua6.m11368T(), cursorRawQuery.getBlob(0))).m11056e();
                                if (cursorRawQuery.moveToNext()) {
                                    d76 d76Var8 = oa6Var.f26514f;
                                    oa6.m9016l(d76Var8);
                                    d76Var8.f16838m.m12505b(d76.m4401y(string), "Get multiple raw event metadata records, expected one. appId");
                                }
                                cursorRawQuery.close();
                                p86Var.f27459b = ua6Var2;
                                if (j2 != -1) {
                                    str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                    strArr2 = new String[]{string, string2, String.valueOf(j2)};
                                } else {
                                    str3 = "app_id = ? and metadata_fingerprint = ?";
                                    strArr2 = new String[]{string, string2};
                                }
                                cursorRawQuery = sQLiteDatabaseM3197l0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str3, strArr2, null, null, "rowid", null);
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        j3 = cursorRawQuery.getLong(0);
                                        l96Var = (l96) q76.m9777k0(m96.m8235y(), cursorRawQuery.getBlob(3));
                                        String string4 = cursorRawQuery.getString(1);
                                        l96Var.m11054c();
                                        ((m96) l96Var.f31181b).m8240E(string4);
                                        long j5 = cursorRawQuery.getLong(2);
                                        l96Var.m11054c();
                                        ((m96) l96Var.f31181b).m8241F(j5);
                                        if (!p86Var.m9437a(j3, (m96) l96Var.m11056e())) {
                                            break;
                                            break;
                                        }
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    d76 d76Var9 = oa6Var.f26514f;
                                    oa6.m9016l(d76Var9);
                                    d76Var9.f16838m.m12505b(d76.m4401y(string), "Raw event data disappeared while in transaction. appId");
                                }
                            }
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        string = str4;
                        d76 d76Var10 = oa6Var.f26514f;
                        oa6.m9016l(d76Var10);
                        d76Var10.f16835j.m12506c("Data loss. Error selecting raw event. appId", d76.m4401y(string), e);
                    }
                }
            } finally {
                if (0 != 0) {
                    cursorRawQuery.close();
                }
            }
        } catch (SQLiteException e6) {
            e = e6;
            str4 = str;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m3194i0() {
        m10368u();
        m3197l0().beginTransaction();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m3195j0() {
        m10368u();
        m3197l0().setTransactionSuccessful();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m3196k0() {
        m10368u();
        m3197l0().endTransaction();
    }

    /* JADX INFO: renamed from: l0 */
    public final SQLiteDatabase m3197l0() {
        mo5038t();
        try {
            return this.f14825h.getWritableDatabase();
        } catch (SQLiteException e) {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12505b(e, "Error opening database");
            throw e;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m3198m0(String str) {
        fs5 fs5VarM3182U;
        m3184W("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m3197l0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (fs5VarM3182U = m3182U("events", str, string)) != null) {
                            m3183V("events_snapshot", fs5VarM3182U);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                d76 d76Var = ((oa6) this.f36084a).f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16835j.m12506c("Error creating snapshot. appId", d76.m4401y(str), e);
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    /* JADX INFO: renamed from: n0 */
    public final void m3199n0(String str) throws Throwable {
        boolean z;
        fs5 fs5VarM3182U;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        fs5 fs5VarM3182U2 = m3182U("events", str, "_f");
        fs5 fs5VarM3182U3 = m3182U("events", str, "_v");
        m3184W("events", str);
        Cursor cursorQuery = null;
        boolean z2 = false;
        try {
            cursorQuery = m3197l0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z3 = false;
                z = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z3 = true;
                            } else if ("_v".equals(string)) {
                                z = true;
                            }
                        }
                        if (string != null && (fs5VarM3182U = m3182U("events_snapshot", str, string)) != null) {
                            m3183V("events", fs5VarM3182U);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        z2 = z3;
                        try {
                            d76 d76Var = ((oa6) this.f36084a).f26514f;
                            oa6.m9016l(d76Var);
                            d76Var.f16835j.m12506c("Error querying snapshot. appId", d76.m4401y(str), e);
                            z3 = z2;
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z2 && fs5VarM3182U2 != null) {
                                m3183V("events", fs5VarM3182U2);
                            } else if (!z && fs5VarM3182U3 != null) {
                                m3183V("events", fs5VarM3182U3);
                            }
                            m3184W("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z2) {
                            if (!z) {
                                m3183V("events", fs5VarM3182U3);
                            }
                        } else if (!z) {
                            m3183V("events", fs5VarM3182U3);
                        }
                        m3184W("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z3 && fs5VarM3182U2 != null) {
                    m3183V("events", fs5VarM3182U2);
                } else if (!z && fs5VarM3182U3 != null) {
                    m3183V("events", fs5VarM3182U3);
                }
            } else {
                cursorQuery.close();
                if (fs5VarM3182U2 != null) {
                    m3183V("events", fs5VarM3182U2);
                } else if (fs5VarM3182U3 != null) {
                    m3183V("events", fs5VarM3182U3);
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        m3184W("events_snapshot", str);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m3200o0(String str, String str2) {
        y42.m12851X(str);
        y42.m12851X(str2);
        mo5038t();
        m10368u();
        try {
            m3197l0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            oa6 oa6Var = (oa6) this.f36084a;
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12507d("Error deleting user property. appId", d76.m4401y(str), oa6Var.f26518j.m9368c(str2), e);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m3201p0(an6 an6Var) {
        oa6 oa6Var = (oa6) this.f36084a;
        String str = an6Var.f14646b;
        mo5038t();
        m10368u();
        String str2 = an6Var.f14645a;
        String str3 = an6Var.f14647c;
        if (m3202q0(str2, str3) == null) {
            if (dn6.m4576t0(str3)) {
                if (m3178Q("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(oa6Var.f26512d.m9223C(str2, e56.f17759V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jM3178Q = m3178Q("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                op5 op5Var = oa6Var.f26512d;
                if (jM3178Q >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(an6Var.f14648d));
        m3157h0(contentValues, an6Var.f14649e);
        try {
            if (m3197l0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12505b(d76.m4401y(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16835j.m12506c("Error storing user property. appId", d76.m4401y(str2), e);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: q0 */
    public final an6 m3202q0(String str, String str2) throws Throwable {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        oa6 oa6Var = (oa6) this.f36084a;
        y42.m12851X(str);
        y42.m12851X(str2);
        mo5038t();
        m10368u();
        Cursor cursor = null;
        try {
            cursorQuery = m3197l0().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        Object objM3169H = m3169H(cursorQuery, 1);
                        if (objM3169H != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                an6 an6Var = new an6(str3, cursorQuery.getString(2), str4, j, objM3169H);
                                if (cursorQuery.moveToNext()) {
                                    d76 d76Var = oa6Var.f26514f;
                                    oa6.m9016l(d76Var);
                                    d76Var.f16835j.m12505b(d76.m4401y(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursorQuery.close();
                                return an6Var;
                            } catch (SQLiteException e) {
                                e = e;
                            }
                        }
                        sQLiteException = e;
                        d76 d76Var2 = oa6Var.f26514f;
                        oa6.m9016l(d76Var2);
                        d76Var2.f16835j.m12507d("Error querying user property. appId", d76.m4401y(str3), oa6Var.f26518j.m9368c(str4), sQLiteException);
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str;
                    str4 = str2;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX INFO: renamed from: r0 */
    public final List m3203r0(String str) {
        String str2;
        SQLiteException sQLiteException;
        oa6 oa6Var = (oa6) this.f36084a;
        y42.m12851X(str);
        mo5038t();
        m10368u();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                op5 op5Var = oa6Var.f26512d;
                cursorQuery = m3197l0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j = cursorQuery.getLong(2);
                        Object objM3169H = m3169H(cursorQuery, 3);
                        if (objM3169H == null) {
                            try {
                                d76 d76Var = oa6Var.f26514f;
                                oa6.m9016l(d76Var);
                                d76Var.f16835j.m12505b(d76.m4401y(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } catch (SQLiteException e) {
                                sQLiteException = e;
                                str2 = str;
                                d76 d76Var2 = oa6Var.f26514f;
                                oa6.m9016l(d76Var2);
                                d76Var2.f16835j.m12506c("Error querying user properties. appId", d76.m4401y(str2), sQLiteException);
                                arrayList = Collections.EMPTY_LIST;
                            }
                        } else {
                            str2 = str;
                            arrayList.add(new an6(str2, str3, string, j, objM3169H));
                        }
                        try {
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteException = e;
                            d76 d76Var3 = oa6Var.f26514f;
                            oa6.m9016l(d76Var3);
                            d76Var3.f16835j.m12506c("Error querying user properties. appId", d76.m4401y(str2), sQLiteException);
                            arrayList = Collections.EMPTY_LIST;
                        }
                    }
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            str2 = str;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0134  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX INFO: renamed from: s0 */
    public final List m3204s0(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        String str5;
        oa6 oa6Var = (oa6) this.f36084a;
        y42.m12851X(str);
        mo5038t();
        m10368u();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb2.append(str3);
                sb2.append("*");
                arrayList2.add(sb2.toString());
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String string = sb.toString();
            op5 op5Var = oa6Var.f26512d;
            d76 d76Var = oa6Var.f26514f;
            Cursor cursorQuery = m3197l0().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    oa6.m9016l(d76Var);
                                    d76Var.f16835j.m12505b(1000, "Read more than the max allowed user properties, ignoring excess");
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j = cursorQuery.getLong(1);
                                Object objM3169H = m3169H(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objM3169H == null) {
                                    try {
                                        oa6.m9016l(d76Var);
                                        d76Var.f16835j.m12507d("(2)Read invalid user property value, ignoring it", d76.m4401y(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        try {
                                            d76 d76Var2 = oa6Var.f26514f;
                                            oa6.m9016l(d76Var2);
                                            d76Var2.f16835j.m12507d("(2)Error querying user properties", d76.m4401y(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursorQuery = cursor;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            return arrayList;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new an6(str, str5, string2, j, objM3169H));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    d76 d76Var3 = oa6Var.f26514f;
                                    oa6.m9016l(d76Var3);
                                    d76Var3.f16835j.m12507d("(2)Error querying user properties", d76.m4401y(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = cursorQuery;
                                d76 d76Var4 = oa6Var.f26514f;
                                oa6.m9016l(d76Var4);
                                d76Var4.f16835j.m12507d("(2)Error querying user properties", d76.m4401y(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursorQuery = cursor;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    str4 = str2;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m3205t0(yo5 yo5Var) {
        oa6 oa6Var = (oa6) this.f36084a;
        mo5038t();
        m10368u();
        String str = yo5Var.f35432d;
        y42.m12854a0(str);
        if (m3202q0(str, yo5Var.f35434f.f34428e) == null) {
            long jM3178Q = m3178Q("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            op5 op5Var = oa6Var.f26512d;
            if (jM3178Q >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", yo5Var.f35433e);
        contentValues.put("name", yo5Var.f35434f.f34428e);
        Object objM12714f = yo5Var.f35434f.m12714f();
        y42.m12854a0(objM12714f);
        m3157h0(contentValues, objM12714f);
        contentValues.put("active", Boolean.valueOf(yo5Var.f35436h));
        contentValues.put("trigger_event_name", yo5Var.f35437i);
        contentValues.put("trigger_timeout", Long.valueOf(yo5Var.f35439k));
        ys5 ys5Var = yo5Var.f35438j;
        dn6 dn6Var = oa6Var.f26517i;
        d76 d76Var = oa6Var.f26514f;
        oa6.m9014j(dn6Var);
        contentValues.put("timed_out_event", dn6.m4571Y(ys5Var));
        contentValues.put("creation_timestamp", Long.valueOf(yo5Var.f35435g));
        oa6.m9014j(dn6Var);
        contentValues.put("triggered_event", dn6.m4571Y(yo5Var.f35440l));
        contentValues.put("triggered_timestamp", Long.valueOf(yo5Var.f35434f.f34429f));
        contentValues.put("time_to_live", Long.valueOf(yo5Var.f35441m));
        contentValues.put("expired_event", dn6.m4571Y(yo5Var.f35442n));
        try {
            if (m3197l0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12505b(d76.m4401y(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12506c("Error storing conditional user property", d76.m4401y(str), e);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0110  */
    /* JADX WARN: Code duplicated, block: B:39:0x0116  */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00f0: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:241), block:B:29:0x00f0 */
    /* JADX INFO: renamed from: u0 */
    public final yo5 m3206u0(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        oa6 oa6Var = (oa6) this.f36084a;
        y42.m12851X(str);
        y42.m12851X(str2);
        mo5038t();
        m10368u();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = m3197l0().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object objM3169H = m3169H(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j = cursorQuery.getLong(4);
                    q76 q76Var = this.f19870f.f28597g;
                    qm6.m9925S(q76Var);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<ys5> creator = ys5.CREATOR;
                    ys5 ys5Var = (ys5) q76Var.m9793c0(blob, creator);
                    long j2 = cursorQuery.getLong(6);
                    qm6.m9925S(q76Var);
                    ys5 ys5Var2 = (ys5) q76Var.m9793c0(cursorQuery.getBlob(7), creator);
                    long j3 = cursorQuery.getLong(8);
                    long j4 = cursorQuery.getLong(9);
                    qm6.m9925S(q76Var);
                    str3 = str2;
                    try {
                        yo5 yo5Var = new yo5(str, str4, new xm6(j3, objM3169H, str3, str4), j2, z, string2, ys5Var, j, ys5Var2, j4, (ys5) q76Var.m9793c0(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            d76 d76Var = oa6Var.f26514f;
                            oa6.m9016l(d76Var);
                            d76Var.f16835j.m12506c("Got multiple records for conditional property, expected one", d76.m4401y(str), oa6Var.f26518j.m9368c(str3));
                        }
                        cursorQuery.close();
                        return yo5Var;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str2;
                }
            } catch (SQLiteException e3) {
                e = e3;
                str3 = str2;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        d76 d76Var2 = oa6Var.f26514f;
        oa6.m9016l(d76Var2);
        d76Var2.f16835j.m12507d("Error querying conditional property", d76.m4401y(str), oa6Var.f26518j.m9368c(str3), e);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m3207v0(String str, String str2) {
        y42.m12851X(str);
        y42.m12851X(str2);
        mo5038t();
        m10368u();
        try {
            m3197l0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            oa6 oa6Var = (oa6) this.f36084a;
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12507d("Error deleting conditional property", d76.m4401y(str), oa6Var.f26518j.m9368c(str2), e);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final List m3208w0(String str, String str2, String str3) {
        y42.m12851X(str);
        mo5038t();
        m10368u();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return m3210x0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX INFO: renamed from: x0 */
    public final List m3210x0(String str, String[] strArr) {
        oa6 oa6Var = (oa6) this.f36084a;
        mo5038t();
        m10368u();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                op5 op5Var = oa6Var.f26512d;
                cursorQuery = m3197l0().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        if (arrayList.size() >= 1000) {
                            d76 d76Var = oa6Var.f26514f;
                            oa6.m9016l(d76Var);
                            d76Var.f16835j.m12505b(1000, "Read more than the max allowed conditional properties, ignoring extra");
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objM3169H = m3169H(cursorQuery, 3);
                        boolean z = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j = cursorQuery.getLong(6);
                        q76 q76Var = this.f19870f.f28597g;
                        qm6.m9925S(q76Var);
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<ys5> creator = ys5.CREATOR;
                        ys5 ys5Var = (ys5) q76Var.m9793c0(blob, creator);
                        long j2 = cursorQuery.getLong(8);
                        qm6.m9925S(q76Var);
                        ys5 ys5Var2 = (ys5) q76Var.m9793c0(cursorQuery.getBlob(9), creator);
                        long j3 = cursorQuery.getLong(10);
                        long j4 = cursorQuery.getLong(11);
                        qm6.m9925S(q76Var);
                        arrayList.add(new yo5(string, string2, new xm6(j3, objM3169H, string3, string2), j2, z, string4, ys5Var, j, ys5Var2, j4, (ys5) q76Var.m9793c0(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                d76 d76Var2 = oa6Var.f26514f;
                oa6.m9016l(d76Var2);
                d76Var2.f16835j.m12505b(e, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final long m3211y(String str, pa6 pa6Var, String str2, Map map, ch6 ch6Var, Long l) {
        int iDelete;
        oa6 oa6Var = (oa6) this.f36084a;
        mo5038t();
        m10368u();
        y42.m12854a0(pa6Var);
        y42.m12851X(str);
        mo5038t();
        m10368u();
        if (m3192f0()) {
            qm6 qm6Var = this.f19870f;
            long jM8623a = qm6Var.f28599i.f29364j.m8623a();
            ia5 ia5Var = oa6Var.f26519k;
            d76 d76Var = oa6Var.f26514f;
            ia5Var.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jM8623a) > ((Long) e56.f17741M.m4379a(null)).longValue()) {
                qm6Var.f28599i.f29364j.m8624b(jElapsedRealtime);
                mo5038t();
                m10368u();
                if (m3192f0() && (iDelete = m3197l0().delete("upload_queue", m3186Y(), new String[0])) > 0) {
                    oa6.m9016l(d76Var);
                    d76Var.f16831L.m12505b(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                y42.m12851X(str);
                mo5038t();
                m10368u();
                try {
                    int iM9223C = oa6Var.f26512d.m9223C(str, e56.f17717A);
                    if (iM9223C > 0) {
                        m3197l0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iM9223C)});
                    }
                } catch (SQLiteException e) {
                    oa6.m9016l(d76Var);
                    d76Var.f16835j.m12506c("Error deleting over the limit queued batches. appId", d76.m4401y(str), e);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] bArrM5118a = pa6Var.m5118a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrM5118a);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", String.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(ch6Var.f16039a));
        ia5 ia5Var2 = oa6Var.f26519k;
        d76 d76Var2 = oa6Var.f26514f;
        ia5Var2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long jInsert = m3197l0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            oa6.m9016l(d76Var2);
            d76Var2.f16835j.m12505b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            oa6.m9016l(d76Var2);
            d76Var2.f16835j.m12506c("Error storing MeasurementBatch to upload_queue. appId", str, e2);
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x03ec  */
    /* JADX INFO: renamed from: y0 */
    public final z76 m3212y0(String str) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        String string;
        oa6 oa6Var = (oa6) this.f36084a;
        y42.m12851X(str);
        mo5038t();
        m10368u();
        Cursor cursor = null;
        try {
            cursorQuery = m3197l0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        qm6 qm6Var = this.f19870f;
                        z76 z76Var = new z76(qm6Var.f28602l, str);
                        oa6 oa6Var2 = z76Var.f35837a;
                        xc6 xc6VarM9947a = qm6Var.m9947a(str);
                        vc6 vc6Var = vc6.ANALYTICS_STORAGE;
                        if (xc6VarM9947a.m12660i(vc6Var)) {
                            z76Var.m13406F(cursorQuery.getString(0));
                        }
                        boolean z = true;
                        z76Var.m13408H(cursorQuery.getString(1));
                        if (qm6Var.m9947a(str).m12660i(vc6.AD_STORAGE)) {
                            z76Var.m13409I(cursorQuery.getString(2));
                        }
                        z76Var.m13424e(cursorQuery.getLong(3));
                        z76Var.m13412L(cursorQuery.getLong(4));
                        z76Var.m13413M(cursorQuery.getLong(5));
                        z76Var.m13415O(cursorQuery.getString(6));
                        z76Var.m13418R(cursorQuery.getString(7));
                        z76Var.m13419S(cursorQuery.getLong(8));
                        z76Var.m13420a(cursorQuery.getLong(9));
                        z76Var.m13423d(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        z76Var.m13428i(cursorQuery.getLong(11));
                        z76Var.m13429j(cursorQuery.getLong(12));
                        z76Var.m13430k(cursorQuery.getLong(13));
                        z76Var.m13431l(cursorQuery.getLong(14));
                        z76Var.m13425f(cursorQuery.getLong(15));
                        z76Var.m13426g(cursorQuery.getLong(16));
                        z76Var.m13417Q(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        z76Var.m13411K(cursorQuery.getString(18));
                        z76Var.m13433n(cursorQuery.getLong(19));
                        z76Var.m13432m(cursorQuery.getLong(20));
                        z76Var.m13441v(cursorQuery.getString(21));
                        boolean z2 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                        ea6 ea6Var = oa6Var2.f26515g;
                        oa6.m9016l(ea6Var);
                        ea6Var.mo5038t();
                        z76Var.f35834Q |= z76Var.f35852p != z2;
                        z76Var.f35852p = z2;
                        z76Var.m13422c(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            z76Var.m13443x(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (qm6Var.m9947a(str).m12660i(vc6Var)) {
                            String string2 = cursorQuery.getString(28);
                            ea6 ea6Var2 = oa6Var2.f26515g;
                            oa6.m9016l(ea6Var2);
                            ea6Var2.mo5038t();
                            z76Var.f35834Q |= !Objects.equals(z76Var.f35856t, string2);
                            z76Var.f35856t = string2;
                        }
                        boolean z3 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        ea6 ea6Var3 = oa6Var2.f26515g;
                        oa6.m9016l(ea6Var3);
                        ea6Var3.mo5038t();
                        z76Var.f35834Q |= z76Var.f35857u != z3;
                        z76Var.f35857u = z3;
                        z76Var.m13437r(cursorQuery.getLong(39));
                        String string3 = cursorQuery.getString(36);
                        ea6 ea6Var4 = oa6Var2.f26515g;
                        oa6.m9016l(ea6Var4);
                        ea6Var4.mo5038t();
                        z76Var.f35834Q |= z76Var.f35820C != string3;
                        z76Var.f35820C = string3;
                        z76Var.m13445z(cursorQuery.getLong(30));
                        z76Var.m13401A(cursorQuery.getLong(31));
                        ho6.m6466a();
                        if (oa6Var.f26512d.m9225E(str, e56.f17748P0)) {
                            int i = cursorQuery.getInt(32);
                            ea6 ea6Var5 = oa6Var2.f26515g;
                            oa6.m9016l(ea6Var5);
                            ea6Var5.mo5038t();
                            z76Var.f35834Q |= z76Var.f35860x != i;
                            z76Var.f35860x = i;
                            z76Var.m13402B(cursorQuery.getLong(35));
                        }
                        boolean z4 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        ea6 ea6Var6 = oa6Var2.f26515g;
                        oa6.m9016l(ea6Var6);
                        ea6Var6.mo5038t();
                        z76Var.f35834Q |= z76Var.f35861y != z4;
                        z76Var.f35861y = z4;
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        ea6 ea6Var7 = oa6Var2.f26515g;
                        oa6.m9016l(ea6Var7);
                        ea6Var7.mo5038t();
                        z76Var.f35834Q |= !Objects.equals(z76Var.f35853q, boolValueOf);
                        z76Var.f35853q = boolValueOf;
                        z76Var.m13435p(cursorQuery.getInt(37));
                        z76Var.m13436q(cursorQuery.getInt(38));
                        if (cursorQuery.isNull(40)) {
                            string = "";
                        } else {
                            string = cursorQuery.getString(40);
                            y42.m12854a0(string);
                        }
                        ea6 ea6Var8 = oa6Var2.f26515g;
                        oa6.m9016l(ea6Var8);
                        ea6Var8.mo5038t();
                        z76Var.f35834Q |= z76Var.f35824G != string;
                        z76Var.f35824G = string;
                        if (!cursorQuery.isNull(41)) {
                            Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
                            ea6 ea6Var9 = oa6Var2.f26515g;
                            oa6.m9016l(ea6Var9);
                            ea6Var9.mo5038t();
                            z76Var.f35834Q |= !Objects.equals(z76Var.f35862z, lValueOf);
                            z76Var.f35862z = lValueOf;
                        }
                        if (!cursorQuery.isNull(42)) {
                            Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
                            ea6 ea6Var10 = oa6Var2.f26515g;
                            oa6.m9016l(ea6Var10);
                            ea6Var10.mo5038t();
                            z76Var.f35834Q |= !Objects.equals(z76Var.f35818A, lValueOf2);
                            z76Var.f35818A = lValueOf2;
                        }
                        byte[] blob = cursorQuery.getBlob(43);
                        ea6 ea6Var11 = oa6Var2.f26515g;
                        oa6.m9016l(ea6Var11);
                        ea6Var11.mo5038t();
                        z76Var.f35834Q |= z76Var.f35825H != blob;
                        z76Var.f35825H = blob;
                        if (!cursorQuery.isNull(44)) {
                            int i2 = cursorQuery.getInt(44);
                            ea6 ea6Var12 = oa6Var2.f26515g;
                            oa6.m9016l(ea6Var12);
                            ea6Var12.mo5038t();
                            boolean z5 = z76Var.f35834Q;
                            if (z76Var.f35826I == i2) {
                                z = false;
                            }
                            z76Var.f35834Q = z | z5;
                            z76Var.f35826I = i2;
                        }
                        ea6 ea6Var13 = oa6Var2.f26515g;
                        oa6.m9016l(ea6Var13);
                        ea6Var13.mo5038t();
                        z76Var.f35834Q = false;
                        if (cursorQuery.moveToNext()) {
                            d76 d76Var = oa6Var.f26514f;
                            oa6.m9016l(d76Var);
                            d76Var.f16835j.m12505b(d76.m4401y(str), "Got multiple records for app, expected one. appId");
                        }
                        cursorQuery.close();
                        return z76Var;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e) {
                e = e;
                d76 d76Var2 = oa6Var.f26514f;
                oa6.m9016l(d76Var2);
                d76Var2.f16835j.m12506c("Error querying app. appId", d76.m4401y(str), e);
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: z */
    public final List m3213z(String str, ll6 ll6Var, int i) {
        ?? arrayList;
        y42.m12851X(str);
        mo5038t();
        m10368u();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseM3197l0 = m3197l0();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strM3156Z = m3156Z(ll6Var.f24141d);
            String strM3186Y = m3186Y();
            StringBuilder sb = new StringBuilder(strM3156Z.length() + 17 + strM3186Y.length());
            sb.append("app_id=?");
            sb.append(strM3156Z);
            sb.append(" AND NOT ");
            sb.append(strM3186Y);
            cursorQuery = sQLiteDatabaseM3197l0.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? String.valueOf(i) : null);
            arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                um6 um6VarM3185X = m3185X(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (um6VarM3185X != null) {
                    arrayList.add(um6VarM3185X);
                }
            }
        } catch (SQLiteException e) {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12506c("Error to querying MeasurementBatch from upload_queue. appId", str, e);
            arrayList = Collections.EMPTY_LIST;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m3214z0(z76 z76Var, boolean z) {
        oa6 oa6Var = (oa6) this.f36084a;
        qm6 qm6Var = this.f19870f;
        oa6 oa6Var2 = z76Var.f35837a;
        mo5038t();
        m10368u();
        String strM13404D = z76Var.m13404D();
        y42.m12854a0(strM13404D);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strM13404D);
        vc6 vc6Var = vc6.ANALYTICS_STORAGE;
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (qm6Var.m9947a(strM13404D).m12660i(vc6Var)) {
            contentValues.put("app_instance_id", z76Var.m13405E());
        }
        contentValues.put("gmp_app_id", z76Var.m13407G());
        if (qm6Var.m9947a(strM13404D).m12660i(vc6.AD_STORAGE)) {
            ea6 ea6Var = oa6Var2.f26515g;
            oa6.m9016l(ea6Var);
            ea6Var.mo5038t();
            contentValues.put("resettable_device_id_hash", z76Var.f35841e);
        }
        ea6 ea6Var2 = oa6Var2.f26515g;
        oa6.m9016l(ea6Var2);
        ea6Var2.mo5038t();
        contentValues.put("last_bundle_index", Long.valueOf(z76Var.f35843g));
        ea6 ea6Var3 = oa6Var2.f26515g;
        oa6.m9016l(ea6Var3);
        ea6Var3.mo5038t();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(z76Var.f35844h));
        ea6 ea6Var4 = oa6Var2.f26515g;
        oa6.m9016l(ea6Var4);
        ea6Var4.mo5038t();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(z76Var.f35845i));
        contentValues.put("app_version", z76Var.m13414N());
        ea6 ea6Var5 = oa6Var2.f26515g;
        oa6.m9016l(ea6Var5);
        ea6Var5.mo5038t();
        contentValues.put("app_store", z76Var.f35848l);
        ea6 ea6Var6 = oa6Var2.f26515g;
        oa6.m9016l(ea6Var6);
        ea6Var6.mo5038t();
        contentValues.put("gmp_version", Long.valueOf(z76Var.f35849m));
        ea6 ea6Var7 = oa6Var2.f26515g;
        oa6.m9016l(ea6Var7);
        ea6Var7.mo5038t();
        contentValues.put("dev_cert_hash", Long.valueOf(z76Var.f35850n));
        ea6 ea6Var8 = oa6Var2.f26515g;
        oa6.m9016l(ea6Var8);
        ea6Var8.mo5038t();
        contentValues.put("measurement_enabled", Boolean.valueOf(z76Var.f35851o));
        ea6 ea6Var9 = oa6Var2.f26515g;
        ea6 ea6Var10 = oa6Var2.f26515g;
        oa6.m9016l(ea6Var9);
        ea6Var9.mo5038t();
        contentValues.put("day", Long.valueOf(z76Var.f35827J));
        oa6.m9016l(ea6Var10);
        ea6Var10.mo5038t();
        contentValues.put("daily_public_events_count", Long.valueOf(z76Var.f35828K));
        oa6.m9016l(ea6Var10);
        ea6Var10.mo5038t();
        contentValues.put("daily_events_count", Long.valueOf(z76Var.f35829L));
        oa6.m9016l(ea6Var10);
        ea6Var10.mo5038t();
        contentValues.put("daily_conversions_count", Long.valueOf(z76Var.f35830M));
        ea6 ea6Var11 = oa6Var2.f26515g;
        oa6.m9016l(ea6Var11);
        ea6Var11.mo5038t();
        contentValues.put("config_fetched_time", Long.valueOf(z76Var.f35835R));
        ea6 ea6Var12 = oa6Var2.f26515g;
        oa6.m9016l(ea6Var12);
        ea6Var12.mo5038t();
        contentValues.put("failed_config_fetch_time", Long.valueOf(z76Var.f35836S));
        contentValues.put("app_version_int", Long.valueOf(z76Var.m13416P()));
        contentValues.put("firebase_instance_id", z76Var.m13410J());
        oa6.m9016l(ea6Var10);
        ea6Var10.mo5038t();
        contentValues.put("daily_error_events_count", Long.valueOf(z76Var.f35831N));
        oa6.m9016l(ea6Var10);
        ea6Var10.mo5038t();
        contentValues.put("daily_realtime_events_count", Long.valueOf(z76Var.f35832O));
        oa6.m9016l(ea6Var10);
        ea6Var10.mo5038t();
        contentValues.put("health_monitor_sample", z76Var.f35833P);
        contentValues.put("android_id", (Long) 0L);
        ea6 ea6Var13 = oa6Var2.f26515g;
        oa6.m9016l(ea6Var13);
        ea6Var13.mo5038t();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(z76Var.f35852p));
        contentValues.put("dynamite_version", Long.valueOf(z76Var.m13421b()));
        if (qm6Var.m9947a(strM13404D).m12660i(vc6Var)) {
            ea6 ea6Var14 = oa6Var2.f26515g;
            oa6.m9016l(ea6Var14);
            ea6Var14.mo5038t();
            contentValues.put("session_stitching_token", z76Var.f35856t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(z76Var.m13444y()));
        ea6 ea6Var15 = oa6Var2.f26515g;
        oa6.m9016l(ea6Var15);
        ea6Var15.mo5038t();
        contentValues.put("target_os_version", Long.valueOf(z76Var.f35858v));
        ea6 ea6Var16 = oa6Var2.f26515g;
        oa6.m9016l(ea6Var16);
        ea6Var16.mo5038t();
        contentValues.put("session_stitching_token_hash", Long.valueOf(z76Var.f35859w));
        ho6.m6466a();
        op5 op5Var = oa6Var.f26512d;
        d76 d76Var = oa6Var.f26514f;
        if (op5Var.m9225E(strM13404D, e56.f17748P0)) {
            ea6 ea6Var17 = oa6Var2.f26515g;
            oa6.m9016l(ea6Var17);
            ea6Var17.mo5038t();
            contentValues.put("ad_services_version", Integer.valueOf(z76Var.f35860x));
            ea6 ea6Var18 = oa6Var2.f26515g;
            oa6.m9016l(ea6Var18);
            ea6Var18.mo5038t();
            contentValues.put("attribution_eligibility_status", Long.valueOf(z76Var.f35819B));
        }
        ea6 ea6Var19 = oa6Var2.f26515g;
        oa6.m9016l(ea6Var19);
        ea6Var19.mo5038t();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(z76Var.f35861y));
        contentValues.put("npa_metadata_value", z76Var.m13442w());
        ea6 ea6Var20 = oa6Var2.f26515g;
        oa6.m9016l(ea6Var20);
        ea6Var20.mo5038t();
        contentValues.put("bundle_delivery_index", Long.valueOf(z76Var.f35823F));
        contentValues.put("sgtm_preview_key", z76Var.m13403C());
        oa6.m9016l(ea6Var10);
        ea6Var10.mo5038t();
        contentValues.put("dma_consent_state", Integer.valueOf(z76Var.f35821D));
        oa6.m9016l(ea6Var10);
        ea6Var10.mo5038t();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(z76Var.f35822E));
        contentValues.put("serialized_npa_metadata", z76Var.m13438s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(z76Var.m13439t()));
        ea6 ea6Var21 = oa6Var2.f26515g;
        oa6.m9016l(ea6Var21);
        ea6Var21.mo5038t();
        ArrayList arrayList = z76Var.f35855s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                oa6.m9016l(d76Var);
                d76Var.f16838m.m12505b(strM13404D, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (oa6Var.f26512d.m9225E(null, e56.f17738K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        ea6 ea6Var22 = oa6Var2.f26515g;
        oa6.m9016l(ea6Var22);
        ea6Var22.mo5038t();
        contentValues.put("unmatched_pfo", z76Var.f35862z);
        ea6 ea6Var23 = oa6Var2.f26515g;
        oa6.m9016l(ea6Var23);
        ea6Var23.mo5038t();
        contentValues.put("unmatched_uwa", z76Var.f35818A);
        ea6 ea6Var24 = oa6Var2.f26515g;
        oa6.m9016l(ea6Var24);
        ea6Var24.mo5038t();
        contentValues.put("ad_campaign_info", z76Var.f35825H);
        try {
            SQLiteDatabase sQLiteDatabaseM3197l0 = m3197l0();
            if (sQLiteDatabaseM3197l0.update("apps", contentValues, "app_id = ?", new String[]{strM13404D}) == 0 && sQLiteDatabaseM3197l0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                oa6.m9016l(d76Var);
                d76Var.f16835j.m12505b(d76.m4401y(strM13404D), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12506c("Error storing app. appId", d76.m4401y(strM13404D), e);
        }
    }

    @Override // p000.rl6
    /* JADX INFO: renamed from: x */
    public final void mo3209x() {
    }
}
