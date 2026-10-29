package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wq5 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33642a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zh0 f33643b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq5(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
        int i = ku5.f23526b;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        byte b = this.f33642a;
        zh0 zh0Var = this.f33643b;
        switch (b) {
            case 0:
                ar5 ar5Var = (ar5) zh0Var;
                oa6 oa6Var = (oa6) ar5Var.f36084a;
                op5 op5Var = oa6Var.f26512d;
                al6 al6Var = ar5Var.f14826i;
                if (al6Var.f14618a != 0 && SystemClock.elapsedRealtime() - al6Var.f14618a < 3600000) {
                    throw new SQLiteException("Database open failed");
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    al6Var.getClass();
                    al6Var.f14618a = SystemClock.elapsedRealtime();
                    d76 d76Var = oa6Var.f26514f;
                    oa6.m9016l(d76Var);
                    d76Var.f16835j.m12504a("Opening the database failed, dropping and recreating it");
                    if (!oa6Var.f26509a.getDatabasePath("google_app_measurement.db").delete()) {
                        d76 d76Var2 = oa6Var.f26514f;
                        oa6.m9016l(d76Var2);
                        d76Var2.f16835j.m12505b("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        al6Var.f14618a = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        d76 d76Var3 = oa6Var.f26514f;
                        oa6.m9016l(d76Var3);
                        d76Var3.f16835j.m12505b(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                oa6 oa6Var2 = (oa6) ((m66) zh0Var).f36084a;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    d76 d76Var4 = oa6Var2.f26514f;
                    oa6.m9016l(d76Var4);
                    d76Var4.f16835j.m12504a("Opening the local database failed, dropping and recreating it");
                    if (!oa6Var2.f26509a.getDatabasePath("google_app_measurement_local.db").delete()) {
                        d76 d76Var5 = oa6Var2.f26514f;
                        oa6.m9016l(d76Var5);
                        d76Var5.f16835j.m12505b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        d76 d76Var6 = oa6Var2.f26514f;
                        oa6.m9016l(d76Var6);
                        d76Var6.f16835j.m12505b(e3, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        byte b = this.f33642a;
        zh0 zh0Var = this.f33643b;
        switch (b) {
            case 0:
                d76 d76Var = ((oa6) ((ar5) zh0Var).f36084a).f26514f;
                oa6.m9016l(d76Var);
                r56.m10218c(d76Var, sQLiteDatabase);
                break;
            default:
                d76 d76Var2 = ((oa6) ((m66) zh0Var).f36084a).f26514f;
                oa6.m9016l(d76Var2);
                r56.m10218c(d76Var2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        byte b = this.f33642a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        byte b = this.f33642a;
        zh0 zh0Var = this.f33643b;
        switch (b) {
            case 0:
                oa6 oa6Var = (oa6) ((ar5) zh0Var).f36084a;
                d76 d76Var = oa6Var.f26514f;
                oa6.m9016l(d76Var);
                r56.m10217b(d76Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", ar5.f14817j);
                d76 d76Var2 = oa6Var.f26514f;
                oa6.m9016l(d76Var2);
                r56.m10217b(d76Var2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                oa6.m9016l(d76Var2);
                r56.m10217b(d76Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                oa6.m9016l(d76Var2);
                r56.m10217b(d76Var2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", ar5.f14819l);
                oa6.m9016l(d76Var2);
                r56.m10217b(d76Var2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", ar5.f14820m);
                oa6.m9016l(d76Var2);
                r56.m10217b(d76Var2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", ar5.f14822o);
                oa6.m9016l(d76Var2);
                r56.m10217b(d76Var2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                oa6.m9016l(d76Var2);
                r56.m10217b(d76Var2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", ar5.f14821n);
                oa6.m9016l(d76Var2);
                r56.m10217b(d76Var2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", ar5.f14823p);
                oa6.m9016l(d76Var2);
                r56.m10217b(d76Var2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", ar5.f14824q);
                oa6.m9016l(d76Var2);
                r56.m10217b(d76Var2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                oa6.m9016l(d76Var2);
                r56.m10217b(d76Var2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", ar5.f14814L);
                oa6.m9016l(d76Var2);
                r56.m10217b(d76Var2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                oa6.m9016l(d76Var2);
                r56.m10217b(d76Var2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                oa6.m9016l(d76Var2);
                r56.m10217b(d76Var2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", ar5.f14815M);
                ho6.m6466a();
                oa6.m9016l(d76Var2);
                r56.m10217b(d76Var2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", ar5.f14816N);
                oa6.m9016l(d76Var2);
                r56.m10217b(d76Var2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", ar5.f14818k);
                oa6.m9016l(d76Var2);
                r56.m10217b(d76Var2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                d76 d76Var3 = ((oa6) ((m66) zh0Var).f36084a).f26514f;
                oa6.m9016l(d76Var3);
                r56.m10217b(d76Var3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", m66.f24694i);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        byte b = this.f33642a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wq5(ar5 ar5Var, Context context) {
        this(context, "google_app_measurement.db");
        this.f33642a = (byte) 0;
        this.f33643b = ar5Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wq5(m66 m66Var, Context context) {
        this(context, "google_app_measurement_local.db");
        this.f33642a = (byte) 1;
        this.f33643b = m66Var;
    }

    /* JADX INFO: renamed from: a */
    private final void m12384a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX INFO: renamed from: b */
    private final void m12385b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX INFO: renamed from: e */
    private final void m12386e(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX INFO: renamed from: g */
    private final void m12387g(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
