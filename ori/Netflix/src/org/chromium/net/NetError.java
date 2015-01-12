// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package org.chromium.net;


public class NetError
{

	public static final int ERR_ABORTED = -3;
	public static final int ERR_ACCESS_DENIED = -10;
	public static final int ERR_ADDRESS_INVALID = -108;
	public static final int ERR_ADDRESS_IN_USE = -147;
	public static final int ERR_ADDRESS_UNREACHABLE = -109;
	public static final int ERR_ADD_USER_CERT_FAILED = -503;
	public static final int ERR_BAD_SSL_CLIENT_AUTH_CERT = -117;
	public static final int ERR_BLOCKED_BY_ADMINISTRATOR = -22;
	public static final int ERR_BLOCKED_BY_CLIENT = -20;
	public static final int ERR_CACHE_CHECKSUM_MISMATCH = -408;
	public static final int ERR_CACHE_CHECKSUM_READ_FAILURE = -407;
	public static final int ERR_CACHE_CREATE_FAILURE = -405;
	public static final int ERR_CACHE_MISS = -400;
	public static final int ERR_CACHE_OPEN_FAILURE = -404;
	public static final int ERR_CACHE_OPERATION_NOT_SUPPORTED = -403;
	public static final int ERR_CACHE_RACE = -406;
	public static final int ERR_CACHE_READ_FAILURE = -401;
	public static final int ERR_CACHE_WRITE_FAILURE = -402;
	public static final int ERR_CERT_AUTHORITY_INVALID = -202;
	public static final int ERR_CERT_COMMON_NAME_INVALID = -200;
	public static final int ERR_CERT_CONTAINS_ERRORS = -203;
	public static final int ERR_CERT_DATE_INVALID = -201;
	public static final int ERR_CERT_END = -212;
	public static final int ERR_CERT_ERROR_IN_SSL_RENEGOTIATION = -116;
	public static final int ERR_CERT_INVALID = -207;
	public static final int ERR_CERT_NON_UNIQUE_NAME = -210;
	public static final int ERR_CERT_NO_REVOCATION_MECHANISM = -204;
	public static final int ERR_CERT_REVOKED = -206;
	public static final int ERR_CERT_UNABLE_TO_CHECK_REVOCATION = -205;
	public static final int ERR_CERT_WEAK_KEY = -211;
	public static final int ERR_CERT_WEAK_SIGNATURE_ALGORITHM = -208;
	public static final int ERR_CLIENT_AUTH_CERT_TYPE_UNSUPPORTED = -151;
	public static final int ERR_CONNECTION_ABORTED = -103;
	public static final int ERR_CONNECTION_CLOSED = -100;
	public static final int ERR_CONNECTION_FAILED = -104;
	public static final int ERR_CONNECTION_REFUSED = -102;
	public static final int ERR_CONNECTION_RESET = -101;
	public static final int ERR_CONNECTION_TIMED_OUT = -118;
	public static final int ERR_CONTENT_DECODING_FAILED = -330;
	public static final int ERR_CONTENT_LENGTH_MISMATCH = -354;
	public static final int ERR_DISALLOWED_URL_SCHEME = -301;
	public static final int ERR_DNS_CACHE_MISS = -804;
	public static final int ERR_DNS_MALFORMED_RESPONSE = -800;
	public static final int ERR_DNS_SEARCH_EMPTY = -805;
	public static final int ERR_DNS_SERVER_FAILED = -802;
	public static final int ERR_DNS_SERVER_REQUIRES_TCP = -801;
	public static final int ERR_DNS_SORT_ERROR = -806;
	public static final int ERR_DNS_TIMED_OUT = -803;
	public static final int ERR_EMPTY_RESPONSE = -324;
	public static final int ERR_ENCODING_CONVERSION_FAILED = -333;
	public static final int ERR_ENCODING_DETECTION_FAILED = -340;
	public static final int ERR_FAILED = -2;
	public static final int ERR_FILE_EXISTS = -16;
	public static final int ERR_FILE_NOT_FOUND = -6;
	public static final int ERR_FILE_NO_SPACE = -18;
	public static final int ERR_FILE_PATH_TOO_LONG = -17;
	public static final int ERR_FILE_TOO_BIG = -8;
	public static final int ERR_FILE_VIRUS_INFECTED = -19;
	public static final int ERR_FTP_BAD_COMMAND_SEQUENCE = -607;
	public static final int ERR_FTP_COMMAND_NOT_SUPPORTED = -606;
	public static final int ERR_FTP_FAILED = -601;
	public static final int ERR_FTP_FILE_BUSY = -604;
	public static final int ERR_FTP_SERVICE_UNAVAILABLE = -602;
	public static final int ERR_FTP_SYNTAX_ERROR = -605;
	public static final int ERR_FTP_TRANSFER_ABORTED = -603;
	public static final int ERR_HOST_RESOLVER_QUEUE_TOO_LARGE = -119;
	public static final int ERR_HTTPS_PROXY_TUNNEL_RESPONSE = -140;
	public static final int ERR_IMPORT_CA_CERT_FAILED = -705;
	public static final int ERR_IMPORT_CA_CERT_NOT_CA = -703;
	public static final int ERR_IMPORT_CERT_ALREADY_EXISTS = -704;
	public static final int ERR_IMPORT_SERVER_CERT_FAILED = -706;
	public static final int ERR_INCOMPLETE_CHUNKED_ENCODING = -355;
	public static final int ERR_INCOMPLETE_SPDY_HEADERS = -347;
	public static final int ERR_INSECURE_RESPONSE = -501;
	public static final int ERR_INSUFFICIENT_RESOURCES = -12;
	public static final int ERR_INTERNET_DISCONNECTED = -106;
	public static final int ERR_INVALID_ARGUMENT = -4;
	public static final int ERR_INVALID_AUTH_CREDENTIALS = -338;
	public static final int ERR_INVALID_CHUNKED_ENCODING = -321;
	public static final int ERR_INVALID_HANDLE = -5;
	public static final int ERR_INVALID_RESPONSE = -320;
	public static final int ERR_INVALID_SPDY_STREAM = -335;
	public static final int ERR_INVALID_URL = -300;
	public static final int ERR_IO_PENDING = -1;
	public static final int ERR_KEY_GENERATION_FAILED = -710;
	public static final int ERR_MALFORMED_IDENTITY = -329;
	public static final int ERR_MANDATORY_PROXY_CONFIGURATION_FAILED = -131;
	public static final int ERR_METHOD_NOT_SUPPORTED = -322;
	public static final int ERR_MISCONFIGURED_AUTH_ENVIRONMENT = -343;
	public static final int ERR_MISSING_AUTH_CREDENTIALS = -341;
	public static final int ERR_MSG_TOO_BIG = -142;
	public static final int ERR_NAME_NOT_RESOLVED = -105;
	public static final int ERR_NAME_RESOLUTION_FAILED = -137;
	public static final int ERR_NETWORK_ACCESS_DENIED = -138;
	public static final int ERR_NETWORK_CHANGED = -21;
	public static final int ERR_NETWORK_IO_SUSPENDED = -331;
	public static final int ERR_NOT_IMPLEMENTED = -11;
	public static final int ERR_NO_PRIVATE_KEY_FOR_CERT = -502;
	public static final int ERR_NO_SSL_VERSIONS_ENABLED = -112;
	public static final int ERR_NO_SUPPORTED_PROXIES = -336;
	public static final int ERR_NPN_NEGOTIATION_FAILED = -122;
	public static final int ERR_ORIGIN_BOUND_CERT_GENERATION_FAILED = -711;
	public static final int ERR_ORIGIN_BOUND_CERT_GENERATION_TYPE_MISMATCH = -152;
	public static final int ERR_OUT_OF_MEMORY = -13;
	public static final int ERR_PAC_NOT_IN_DHCP = -348;
	public static final int ERR_PAC_SCRIPT_FAILED = -327;
	public static final int ERR_PAC_STATUS_NOT_OK = -326;
	public static final int ERR_PIPELINE_EVICTION = -353;
	public static final int ERR_PKCS12_IMPORT_BAD_PASSWORD = -701;
	public static final int ERR_PKCS12_IMPORT_FAILED = -702;
	public static final int ERR_PKCS12_IMPORT_INVALID_FILE = -708;
	public static final int ERR_PKCS12_IMPORT_INVALID_MAC = -707;
	public static final int ERR_PKCS12_IMPORT_UNSUPPORTED = -709;
	public static final int ERR_PRECONNECT_MAX_SOCKET_LIMIT = -133;
	public static final int ERR_PRIVATE_KEY_EXPORT_FAILED = -712;
	public static final int ERR_PROTOCOL_SWITCHED = -146;
	public static final int ERR_PROXY_AUTH_REQUESTED = -127;
	public static final int ERR_PROXY_AUTH_UNSUPPORTED = -115;
	public static final int ERR_PROXY_CERTIFICATE_INVALID = -136;
	public static final int ERR_PROXY_CONNECTION_FAILED = -130;
	public static final int ERR_QUIC_PROTOCOL_ERROR = -356;
	public static final int ERR_REQUEST_RANGE_NOT_SATISFIABLE = -328;
	public static final int ERR_RESPONSE_BODY_TOO_BIG_TO_DRAIN = -345;
	public static final int ERR_RESPONSE_HEADERS_MULTIPLE_CONTENT_DISPOSITION = -349;
	public static final int ERR_RESPONSE_HEADERS_MULTIPLE_CONTENT_LENGTH = -346;
	public static final int ERR_RESPONSE_HEADERS_MULTIPLE_LOCATION = -350;
	public static final int ERR_RESPONSE_HEADERS_TOO_BIG = -325;
	public static final int ERR_RESPONSE_HEADERS_TRUNCATED = -357;
	public static final int ERR_SELF_SIGNED_CERT_GENERATION_FAILED = -713;
	public static final int ERR_SOCKET_IS_CONNECTED = -23;
	public static final int ERR_SOCKET_NOT_CONNECTED = -15;
	public static final int ERR_SOCKS_CONNECTION_FAILED = -120;
	public static final int ERR_SOCKS_CONNECTION_HOST_UNREACHABLE = -121;
	public static final int ERR_SPDY_PING_FAILED = -352;
	public static final int ERR_SPDY_PROTOCOL_ERROR = -337;
	public static final int ERR_SPDY_SERVER_REFUSED_STREAM = -351;
	public static final int ERR_SPDY_SESSION_ALREADY_EXISTS = -143;
	public static final int ERR_SSL_BAD_PEER_PUBLIC_KEY = -149;
	public static final int ERR_SSL_BAD_RECORD_MAC_ALERT = -126;
	public static final int ERR_SSL_CLIENT_AUTH_CERT_NEEDED = -110;
	public static final int ERR_SSL_CLIENT_AUTH_CERT_NO_PRIVATE_KEY = -135;
	public static final int ERR_SSL_CLIENT_AUTH_PRIVATE_KEY_ACCESS_DENIED = -134;
	public static final int ERR_SSL_CLIENT_AUTH_SIGNATURE_FAILED = -141;
	public static final int ERR_SSL_DECOMPRESSION_FAILURE_ALERT = -125;
	public static final int ERR_SSL_DECRYPT_ERROR_ALERT = -153;
	public static final int ERR_SSL_HANDSHAKE_NOT_COMPLETED = -148;
	public static final int ERR_SSL_NO_RENEGOTIATION = -123;
	public static final int ERR_SSL_PINNED_KEY_NOT_IN_CERT_CHAIN = -150;
	public static final int ERR_SSL_PROTOCOL_ERROR = -107;
	public static final int ERR_SSL_RENEGOTIATION_REQUESTED = -114;
	public static final int ERR_SSL_UNSAFE_NEGOTIATION = -128;
	public static final int ERR_SSL_VERSION_OR_CIPHER_MISMATCH = -113;
	public static final int ERR_SSL_WEAK_SERVER_EPHEMERAL_DH_KEY = -129;
	public static final int ERR_SYN_REPLY_NOT_RECEIVED = -332;
	public static final int ERR_TEMPORARILY_THROTTLED = -139;
	public static final int ERR_TIMED_OUT = -7;
	public static final int ERR_TOO_MANY_REDIRECTS = -310;
	public static final int ERR_TOO_MANY_SOCKET_STREAMS = -155;
	public static final int ERR_TUNNEL_CONNECTION_FAILED = -111;
	public static final int ERR_UNDOCUMENTED_SECURITY_LIBRARY_STATUS = -344;
	public static final int ERR_UNEXPECTED = -9;
	public static final int ERR_UNEXPECTED_PROXY_AUTH = -323;
	public static final int ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS = -342;
	public static final int ERR_UNKNOWN_URL_SCHEME = -302;
	public static final int ERR_UNRECOGNIZED_FTP_DIRECTORY_LISTING_FORMAT = -334;
	public static final int ERR_UNSAFE_PORT = -312;
	public static final int ERR_UNSAFE_REDIRECT = -311;
	public static final int ERR_UNSUPPORTED_AUTH_SCHEME = -339;
	public static final int ERR_UPLOAD_FILE_CHANGED = -14;
	public static final int ERR_WINSOCK_UNEXPECTED_WRITTEN_BYTES = -124;
	public static final int ERR_WS_PROTOCOL_ERROR = -145;
	public static final int ERR_WS_THROTTLE_QUEUE_TOO_LARGE = -154;

	public NetError()
	{
	}
}
