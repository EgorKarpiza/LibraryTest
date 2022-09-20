
--
-- TOC entry 219 (class 1255 OID 33003)
-- Name: delauthor(bigint); Type: PROCEDURE; Schema: public; Owner: postgres
--

CREATE PROCEDURE public.delauthor(IN i_id_author bigint)
    LANGUAGE plpgsql
    AS $$

	BEGIN
		delete from author where id_author=i_id_author;
	END;
$$;


ALTER PROCEDURE public.delauthor(IN i_id_author bigint) OWNER TO postgres;

--
-- TOC entry 220 (class 1255 OID 33004)
-- Name: delauthorbooks(bigint); Type: PROCEDURE; Schema: public; Owner: postgres
--

CREATE PROCEDURE public.delauthorbooks(IN i_id_author_books bigint)
    LANGUAGE plpgsql
    AS $$
	BEGIN
		delete from author_books where id_author_books=i_id_author_books;
	END;
$$;


ALTER PROCEDURE public.delauthorbooks(IN i_id_author_books bigint) OWNER TO postgres;

--
-- TOC entry 221 (class 1255 OID 33005)
-- Name: delbook(bigint); Type: PROCEDURE; Schema: public; Owner: postgres
--

CREATE PROCEDURE public.delbook(IN i_id_book bigint)
    LANGUAGE plpgsql
    AS $$
	BEGIN
		delete from book where id_book=i_id_book;
	END;
$$;


ALTER PROCEDURE public.delbook(IN i_id_book bigint) OWNER TO postgres;

--
-- TOC entry 222 (class 1255 OID 33006)
-- Name: dellibrarycard(bigint); Type: PROCEDURE; Schema: public; Owner: postgres
--

CREATE PROCEDURE public.dellibrarycard(IN i_id_library_card bigint)
    LANGUAGE plpgsql
    AS $$
	BEGIN
		delete from library_card where id_library_card=i_id_library_card;
	END;
$$;


ALTER PROCEDURE public.dellibrarycard(IN i_id_library_card bigint) OWNER TO postgres;

--
-- TOC entry 223 (class 1255 OID 33007)
-- Name: delreader(bigint); Type: PROCEDURE; Schema: public; Owner: postgres
--

CREATE PROCEDURE public.delreader(IN i_id_reader bigint)
    LANGUAGE plpgsql
    AS $$
	BEGIN
		delete from reader where id_reader=i_id_reader;
	END;
$$;


ALTER PROCEDURE public.delreader(IN i_id_reader bigint) OWNER TO postgres;

--
-- TOC entry 224 (class 1255 OID 33008)
-- Name: saveauthor(character varying); Type: PROCEDURE; Schema: public; Owner: postgres
--

CREATE PROCEDURE public.saveauthor(IN i_author_name character varying)
    LANGUAGE plpgsql
    AS $$

	BEGIN
		INSERT into author (id_author,author_name)
		values ( nextval('seq_aut'), i_author_name);
	END;
$$;


ALTER PROCEDURE public.saveauthor(IN i_author_name character varying) OWNER TO postgres;

--
-- TOC entry 225 (class 1255 OID 33009)
-- Name: saveauthorbooks(bigint, bigint); Type: PROCEDURE; Schema: public; Owner: postgres
--

CREATE PROCEDURE public.saveauthorbooks(IN i_id_author bigint, IN i_id_book bigint)
    LANGUAGE plpgsql
    AS $$

	BEGIN
		INSERT into author_books (id_author_books,id_author,id_book)
		values ( nextval('seq_book'), i_id_author, i_id_book);
	END;
$$;


ALTER PROCEDURE public.saveauthorbooks(IN i_id_author bigint, IN i_id_book bigint) OWNER TO postgres;

--
-- TOC entry 226 (class 1255 OID 33010)
-- Name: savebook(character varying, bigint); Type: PROCEDURE; Schema: public; Owner: postgres
--

CREATE PROCEDURE public.savebook(IN i_title character varying, IN i_number_of_pages bigint)
    LANGUAGE plpgsql
    AS $$

	BEGIN
		INSERT into book (id_book,title,number_of_pages)
		values ( nextval('seq_book'), i_title, i_number_of_pages);
	END;
$$;


ALTER PROCEDURE public.savebook(IN i_title character varying, IN i_number_of_pages bigint) OWNER TO postgres;

--
-- TOC entry 227 (class 1255 OID 33011)
-- Name: savelibrarycard(bigint, bigint, boolean, date, date); Type: PROCEDURE; Schema: public; Owner: postgres
--

CREATE PROCEDURE public.savelibrarycard(IN i_id_reader bigint, IN i_id_author_books bigint, IN i_refund boolean, IN i_return_date date, IN i_date_of_issue date)
    LANGUAGE plpgsql
    AS $$

	BEGIN
		INSERT into library_card (id_library_card, id_author_books, refund, return_date, date_of_issue)
		values ( nextval('seq_read'), i_id_author_books, i_refund, i_return_date, i_date_of_issue);
	END;
$$;


ALTER PROCEDURE public.savelibrarycard(IN i_id_reader bigint, IN i_id_author_books bigint, IN i_refund boolean, IN i_return_date date, IN i_date_of_issue date) OWNER TO postgres;

--
-- TOC entry 228 (class 1255 OID 33012)
-- Name: savereader(character varying, character varying, bigint); Type: PROCEDURE; Schema: public; Owner: postgres
--

CREATE PROCEDURE public.savereader(IN i_full_name character varying, IN i_addres character varying, IN i_phone_number bigint)
    LANGUAGE plpgsql
    AS $$

	BEGIN
		INSERT into reader (id_reader,full_name,addres,phone_number)
		values ( nextval('seq_read'), i_full_name, i_addres, i_phone_number);
	END;
$$;


ALTER PROCEDURE public.savereader(IN i_full_name character varying, IN i_addres character varying, IN i_phone_number bigint) OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;



--
-- TOC entry 234 (class 1255 OID 33039)
-- Name: updateauthor(bigint, character varying); Type: PROCEDURE; Schema: public; Owner: postgres
--

CREATE PROCEDURE public.updateauthor(IN i_id_author bigint, IN i_author_name character varying)
    LANGUAGE plpgsql
    AS $$

	BEGIN
		update author
		set author_name= i_author_name
		where id_author=i_id_author;
	END;
$$;


ALTER PROCEDURE public.updateauthor(IN i_id_author bigint, IN i_author_name character varying) OWNER TO postgres;

--
-- TOC entry 235 (class 1255 OID 33040)
-- Name: updateauthorbooks(bigint, bigint, bigint); Type: PROCEDURE; Schema: public; Owner: postgres
--

CREATE PROCEDURE public.updateauthorbooks(IN i_id_author_books bigint, IN i_id_author bigint, IN i_id_book bigint)
    LANGUAGE plpgsql
    AS $$
	BEGIN
		update author_books
		set id_author= i_id_author,
		    id_book= i_id_book
		where id_author_books=i_id_author_books;
	END;
$$;


ALTER PROCEDURE public.updateauthorbooks(IN i_id_author_books bigint, IN i_id_author bigint, IN i_id_book bigint) OWNER TO postgres;

--
-- TOC entry 236 (class 1255 OID 33041)
-- Name: updatebook(bigint, character varying, bigint); Type: PROCEDURE; Schema: public; Owner: postgres
--

CREATE PROCEDURE public.updatebook(IN i_id_book bigint, IN i_title character varying, IN i_number_of_pages bigint)
    LANGUAGE plpgsql
    AS $$
	BEGIN
		update book
		set   title= i_title,
		      number_of_pages=i_number_of_pages
		where id_book=i_id_book;
	END;
$$;


ALTER PROCEDURE public.updatebook(IN i_id_book bigint, IN i_title character varying, IN i_number_of_pages bigint) OWNER TO postgres;

--
-- TOC entry 237 (class 1255 OID 33042)
-- Name: updatelibrarycard(bigint, bigint, bigint, boolean, date, date); Type: PROCEDURE; Schema: public; Owner: postgres
--

CREATE PROCEDURE public.updatelibrarycard(IN i_id_library_card bigint, IN i_id_reader bigint, IN i_id_author_books bigint, IN i_refund boolean, IN i_return_date date, IN i_date_of_issue date)
    LANGUAGE plpgsql
    AS $$
	BEGIN
		update library_card
		set id_library_card= i_id_library_card,
		    id_reader= i_id_reader,
		    refund= i_refund,
		    return_date= i_return_date,
		    date_of_issue= i_date_of_issue
		where id_library_card=i_id_library_card;
	END;
$$;


ALTER PROCEDURE public.updatelibrarycard(IN i_id_library_card bigint, IN i_id_reader bigint, IN i_id_author_books bigint, IN i_refund boolean, IN i_return_date date, IN i_date_of_issue date) OWNER TO postgres;

--
-- TOC entry 238 (class 1255 OID 33043)
-- Name: updatereader(bigint, character varying, character varying, bigint); Type: PROCEDURE; Schema: public; Owner: postgres
--

CREATE PROCEDURE public.updatereader(IN i_id_reader bigint, IN i_full_name character varying, IN i_addres character varying, IN i_phone_number bigint)
    LANGUAGE plpgsql
    AS $$
	BEGIN
		update reader
		set id_reader= i_id_reader,
		    full_name= i_full_name,
		    addres= i_addres,
		    phone_number= i_phone_number
		where id_reader=i_id_reader;
	END;
$$;


ALTER PROCEDURE public.updatereader(IN i_id_reader bigint, IN i_full_name character varying, IN i_addres character varying, IN i_phone_number bigint) OWNER TO postgres;
